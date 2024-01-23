package com.example.mindfulmateapp.user.repository;

import com.example.mindfulmateapp.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByUserName(String userName);
    Optional<User> findByPassword(String password);
}
