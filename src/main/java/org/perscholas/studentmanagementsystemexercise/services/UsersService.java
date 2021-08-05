package org.perscholas.studentmanagementsystemexercise.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.studentmanagementsystemexercise.dao.CoursesRepo;
import org.perscholas.studentmanagementsystemexercise.dao.UsersRepo;
import org.perscholas.studentmanagementsystemexercise.models.Courses;
import org.perscholas.studentmanagementsystemexercise.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class UsersService {

    private UsersRepo userRepo;
    private CoursesRepo courseRepo;

    @Autowired
    public UsersService(UsersRepo userRepo, CoursesRepo courseRepo) {
        this.userRepo = userRepo;
        this.courseRepo = courseRepo;
    }

    public List<Users> getAllUsers(){
        List<Users> thisuser = userRepo.findAll( );
        return thisuser;
    }

    public boolean validateUser(String email, String password) {
        if (userRepo.findByEmail(email).isPresent())
        {
            if (userRepo.findByEmail(email).get().getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public void addNewUser(Users user) {
        Optional<Users> studentOptional = userRepo.findByEmail(user.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        userRepo.save(user);
        log.warn(user.toString());
    }



    public void registerStudentToCourse(String email, Integer cId){
        Users tempUser = null;
        if (userRepo.findByEmail(email).isPresent())
        {
            tempUser = userRepo.findByEmail(email).get();
        }
    }

    public List<Courses> getStudentCourses(String email)
    {
        List<Courses> cList = null;
        Users user = null;
        if (userRepo.findByEmail(email).isPresent())
        {
             user = userRepo.findByEmail(email).get();

        }
        return user.getCourses();

    }

    public Users getUserbyEmail(String email)
    {
        if (userRepo.findByEmail(email).isPresent())
            return userRepo.findByEmail(email).get();
        else

        return new Users();

    }

}
