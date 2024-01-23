package com.example.mindfulmateapp.mood;

import com.example.mindfulmateapp.mood.model.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

// MoodEntryRepository.java
public interface MoodEntryRepository extends JpaRepository<MoodEntry, Long> {

    List<MoodEntry> findByDate(LocalDate date);
}
