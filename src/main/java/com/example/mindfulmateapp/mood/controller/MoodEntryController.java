package com.example.mindfulmateapp.mood.controller;

import com.example.mindfulmateapp.mood.MoodEntryRepository;

import com.example.mindfulmateapp.mood.model.Mood;
import com.example.mindfulmateapp.mood.model.MoodEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

// MoodEntryController.java
@RestController
@RequestMapping("/api/mood-entries")
public class MoodEntryController {

    @Autowired
    private MoodEntryRepository moodEntryRepository;

    @GetMapping
    public List<MoodEntry> getAllMoodEntries() {
        return moodEntryRepository.findAll();
    }

    @GetMapping("/{date}")
    public List<MoodEntry> getMoodEntriesByDate(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date);
        return moodEntryRepository.findByDate(localDate);
    }

    @PostMapping
    public MoodEntry saveMoodEntry(@RequestBody MoodEntry moodEntry) {
        return moodEntryRepository.save(moodEntry);
    }
}
