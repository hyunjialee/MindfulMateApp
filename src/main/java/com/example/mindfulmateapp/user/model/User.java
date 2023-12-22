package com.example.mindfulmateapp.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}
