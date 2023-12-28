package com.example.mindfulmateapp.mood.repository;

import com.example.mindfulmateapp.mood.model.MoodName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodNameRepository extends JpaRepository<MoodName, Integer> {
}
