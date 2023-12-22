package com.example.mindfulmateapp.user.repository;

import com.example.mindfulmateapp.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
//
//    List<User> findAllUsers();
//    User findUserByID(Integer id);
}
