package com.example.mindfulmateapp.mood.service;

import com.example.mindfulmateapp.mood.repository.MoodRepository;
import com.example.mindfulmateapp.mood.model.Mood;
import com.example.mindfulmateapp.mood.model.MoodEntry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MoodServiceImplement implements MoodService {

    private final MoodRepository moodRepository;

    private List<Mood> moods = Arrays.asList(Mood.values());


    public List<Mood> getAllTopics() {
        return moods;
    }

    public Optional<MoodEntry> show (int id){
        return moodRepository.findById(id);
    }

    public Boolean deleteEntry(int id){
        moodRepository.deleteById(id);
        return true;
    }

    public MoodEntry create(MoodEntry entry){
        return moodRepository.save(entry);
    }
}
