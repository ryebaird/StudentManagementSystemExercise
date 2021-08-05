package org.perscholas.studentmanagementsystemexercise.dao;

import lombok.NonNull;
import lombok.ToString;
import org.perscholas.studentmanagementsystemexercise.models.Courses;
import org.perscholas.studentmanagementsystemexercise.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface CoursesRepo extends JpaRepository<Courses,Integer> {

}
