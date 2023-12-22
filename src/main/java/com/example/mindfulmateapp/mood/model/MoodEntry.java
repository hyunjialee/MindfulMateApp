package com.example.mindfulmateapp.mood.model;

import com.example.mindfulmateapp.user.model.User;
import lombok.Data;
import java.util.Date;

@Data
public class MoodEntry {
    // @Data creates the constructors for you

    private Mood mood;
    private int moodID;
    private int userID;
    private Date date;
}
