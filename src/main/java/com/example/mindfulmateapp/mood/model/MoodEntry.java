package com.example.mindfulmateapp.mood.model;

import com.example.mindfulmateapp.user.model.User;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class MoodEntry {
    // @Data creates the constructors for you

    @Id
    @GeneratedValue
    private int moodId;
    private Mood mood;
    private Date date;


    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
