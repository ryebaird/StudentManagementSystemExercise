package org.perscholas.studentmanagementsystemexercise;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.studentmanagementsystemexercise.dao.CoursesRepo;
import org.perscholas.studentmanagementsystemexercise.dao.UsersRepo;
import org.perscholas.studentmanagementsystemexercise.models.Courses;
import org.perscholas.studentmanagementsystemexercise.models.Users;
import org.perscholas.studentmanagementsystemexercise.services.CoursesService;
import org.perscholas.studentmanagementsystemexercise.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Slf4j
@Component
@Transactional
public class AppRunner implements CommandLineRunner {
    // autowire all repo's/services
    UsersRepo usersRepo;
    CoursesRepo coursesRepo;
    UsersService us;
    CoursesService cs;

    @Autowired
    public AppRunner(CoursesRepo coursesRepo, UsersRepo usersrepo, UsersService us, CoursesService cs) {
        this.coursesRepo = coursesRepo;
        this.usersRepo = usersrepo;
        this.us=us;
        this.cs=cs;
    }


    @Override
    public void run(String... args) throws Exception {

        Courses java = new Courses(
                    1,
                "Java",
                    "Jafer"
        );
        Courses javaScript = new Courses(
               2,
                "JavaScript",
                "Jafer"
        );
        Courses TypeScript = new Courses(
                3,
                "TypeScript",
                "Miller"
        );
        Courses Python = new Courses(
                4,
                "Python",
                "Bill"
        );
        Courses C = new Courses(
                5,
                "C",
                "Peterpan"
        );
        Courses SQL = new Courses(
                6,
                "SQL",
                "Haseeb"
        );

        Users Maria = new Users(
                //remove id here
                "maria.jam@gmail.com",
                "Maria",

                "qwert1"

        );
        Users Lily = new Users(
                //remove id
                "Lily",
                "lily.he@gmail.com",
                "asdfg2"
        );
        Users Ann = new Users(
                //remove id
                "Ann",
                "ann.well@gmail.com",
                "kljid3"
        );
        Users Jean = new Users(
                //remove id
                "Jean",
                "jean51@gmail.com",
                "opiuh4"
        );
        Users Bree = new Users(
                //remove id
                "Bree",
                "bree98@yahoo.com",
                "poiku9"
        );
        Users Charlie = new Users(
                //remove id
                "Charlie",
                "cli@gmail.com",
                "miukl78"
        );
        Users Mike = new Users(
                //remove id
                "Mike",
                "mike.lar@hotmail.com",
                "hels876"
        );
        Users Tom = new Users(
                //remove id
                "Tom",
                "tom.us@gmail.com",
                "poijk8ds"
        );
        Users Dave = new Users(
                //remove id
                "Dave",
                "dave.k@gmail.com",
                "gydeju8"
        );

        Tom.setCourses(List.of(java,javaScript));
        coursesRepo.saveAll(List.of(java,javaScript, TypeScript, Python, C, SQL));
        usersRepo.saveAll(List.of(Maria, Lily, Ann, Jean, Bree, Charlie, Mike, Tom, Dave));
        Users newUser = new Users(
                //remove id
                "test",
                "user@gmail.com",
                "userpassword"
        );

        List<Courses> courseList = us.getStudentCourses("tom.us@gmail.com");
        log.warn(courseList.toString());
        us.addNewUser(newUser);

               // add dummy data


    }
}
