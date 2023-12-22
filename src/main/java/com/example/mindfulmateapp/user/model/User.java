package com.example.mindfulmateapp.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    private int id;
    private String userName;
    private String email;
    private String password;

}
