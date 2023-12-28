package com.example.mindfulmateapp.mood.repository;

import com.example.mindfulmateapp.mood.model.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface MoodRepository extends JpaRepository<MoodEntry, Integer> {
}
