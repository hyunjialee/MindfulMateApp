package com.example.mindfulmateapp.mood.model;

import com.example.mindfulmateapp.user.model.User;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Data
@Entity
//@JsonDeserialize(using = MoodEntryDeserializer.class)
public class  MoodEntry {
    // @Data creates the constructors for you

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int entryId;

    @ManyToOne(targetEntity = MoodName.class)
    @JoinColumn(name = "mood_id", nullable = false)
    private MoodName moodId;
    //select mood from moodId LEFT JOIN to mood enum table on moodId;
    //select mood from moodTable et left join moodEntry em on
    // et.moodId = em.moodId where em.user_id = column and em.date = column
    private LocalDate date;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}
