package org.perscholas.studentmanagementsystemexercise.dao;

import org.perscholas.studentmanagementsystemexercise.models.Courses;
import org.perscholas.studentmanagementsystemexercise.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long> {
    Optional<Users> findByEmail(String email);
    List<Courses> findCoursesByEmail(String email);
}
