package com.example.CRUD.Repository;

import com.example.CRUD.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
