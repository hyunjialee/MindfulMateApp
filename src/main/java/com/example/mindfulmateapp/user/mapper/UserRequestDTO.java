package com.example.mindfulmateapp.user.mapper;

import lombok.Builder;

@Builder
public class UserRequestDTO {
    private int id;
    private String name;
    private String email;
    private String password;
}
