package com.example.mindfulmateapp.mood.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
//@JsonDeserialize(using = MoodNameDeserializer.class)
public class MoodName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int moodId;
    private String mood;


    public MoodName(String mood) {
        this.mood = mood;
    }

    public MoodName() {

    }
}
