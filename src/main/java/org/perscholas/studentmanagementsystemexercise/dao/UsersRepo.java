package org.perscholas.studentmanagementsystemexercise.dao;

import org.perscholas.studentmanagementsystemexercise.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long> {
}
