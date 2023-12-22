package com.example.mindfulmateapp.mood.service;

import com.example.mindfulmateapp.mood.MoodRepository;
import com.example.mindfulmateapp.mood.MoodService;
import com.example.mindfulmateapp.mood.model.Mood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MoodServiceImplement implements MoodService {

    private final MoodRepository moodRepository;


    private List<Mood> moods = Arrays.asList(Mood.values());


    public List<Mood> getAllTopics() {
        return moods;
    }
}
