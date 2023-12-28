package com.example.mindfulmateapp.user.model;

import com.example.mindfulmateapp.mood.model.MoodEntry;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    private String userName;
    private String email;
    private String password;



    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    List<MoodEntry> moodEntries;

}
