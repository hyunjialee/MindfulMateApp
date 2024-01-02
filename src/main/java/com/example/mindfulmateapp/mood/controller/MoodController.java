package com.example.mindfulmateapp.mood.controller;

import com.example.mindfulmateapp.mood.model.Mood;
import com.example.mindfulmateapp.mood.model.MoodEntry;
import com.example.mindfulmateapp.mood.service.MoodServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MoodController {
    //handles end points

    private final MoodServiceImplement moodService;

    @Autowired
    public MoodController(MoodServiceImplement moodService){
        this.moodService = moodService;
    }

    @GetMapping("/moods")
    public List<Mood> listMyEnums(){
        return moodService.getAllTopics();
    }

    @PostMapping("/selectedMood")
    public MoodEntry createEntry(@RequestBody MoodEntry mood){
        return (moodService.create(mood));
    }

    @GetMapping("/showEntry")
    public Optional<MoodEntry> showEntry(@RequestParam int id){
        return (moodService.show(id));
    }


            // EXAMPLE POSTMAN ENTRY FOR MOOD ENTRY.
    //{
    //    "entryId": 1,
    //    "moodId": {
    //        "moodId": 1,
    //        "mood": "Happy"
    //    },
    //    "date": "2023-26-12",
    //    "user": {
    //        "userId": 1,
    //        "userName": "JJYC",
    //        "email": "itsayaboy@gmail.com",
    //        "password": "facebookStoresItInATxTFile"
    //    }
    //}

}
