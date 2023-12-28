package com.example.mindfulmateapp.mood.controller;

import com.example.mindfulmateapp.mood.MoodService;
import com.example.mindfulmateapp.mood.model.Mood;
import com.example.mindfulmateapp.mood.model.MoodEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MoodController {
    //handles end points

    private final MoodService moodService;

    @Autowired
    public MoodController(MoodService moodService){
        this.moodService = moodService;
    }

    @GetMapping("")
    public String greeting(){
        return "Hi, welcome to my app";
    }

    @GetMapping("/happy")
    public Mood sayHi(){
        MoodEntry mood = new MoodEntry();

        mood.setMood(Mood.HAPPY);
        return mood.getMood();
    }

    @GetMapping("/moods")
    public List<Mood> listMyEnums(){
        return moodService.getAllTopics();
    }




}
