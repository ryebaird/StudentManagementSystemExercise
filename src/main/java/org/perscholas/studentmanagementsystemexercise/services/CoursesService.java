package org.perscholas.studentmanagementsystemexercise.services;





import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import org.perscholas.studentmanagementsystemexercise.dao.CoursesRepo;
import org.perscholas.studentmanagementsystemexercise.models.Courses;
import java.util.List;

@Service
@Transactional
@Slf4j

public class CoursesService {

    private CoursesRepo coursesRepo;

    @Autowired
    public CoursesService(CoursesRepo coursesRepo) {
        this.coursesRepo = coursesRepo;
    }

    public List<Courses> getAllCourses(){

        //List<Courses> thiscourse = coursesRepo.findAll();
        //log.warn(thiscourse.toString());
        return coursesRepo.findAll();
    };


}
