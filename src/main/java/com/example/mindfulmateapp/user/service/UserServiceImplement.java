package com.example.mindfulmateapp.user.service;

import com.example.mindfulmateapp.user.repository.UserRepository;
import com.example.mindfulmateapp.user.UserService;
import com.example.mindfulmateapp.user.mapper.UserRequestDTO;
import com.example.mindfulmateapp.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplement(UserRepository userRepository){
        this.userRepository = userRepository;
    }


//    public UserRequestDTO findUserByID(Integer id){
//        User userID = userRepository.findUserByID(id);
//
//        return UserRequestDTO.builder().name(userID.getName()).email(userID.getEmail()).password(userID.getPassword())
//                .id(userID.getId()).build();
//    }


}
