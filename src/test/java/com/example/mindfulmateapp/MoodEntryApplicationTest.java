package com.example.mindfulmateapp;

import com.example.mindfulmateapp.mood.model.Mood;
import com.example.mindfulmateapp.mood.model.MoodEntry;
import com.example.mindfulmateapp.mood.model.MoodName;
import com.example.mindfulmateapp.user.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MoodEntryApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void moodTest(){
        MoodEntry mood = new MoodEntry();
        mood.setEntryId(1);

        Integer expected = 1;

        Assertions.assertEquals(expected, mood.getEntryId());

    }
    @Test
    public void moodTest1(){
        MoodEntry mood = new MoodEntry();
        mood.setEntryId(0);

        Integer expected = 0;

        Assertions.assertEquals(expected, mood.getEntryId());

    }

    @Test
    public void moodTest2(){
        MoodEntry mood = new MoodEntry();

        Mood mood1 = Mood.HAPPY;

        mood.setMoodId(new MoodName(mood1.name()));

        Assertions.assertNotNull(mood);

    }

    @Test
    public void moodTest3(){
        Mood mood1 = Mood.HAPPY;
        Assertions.assertNotNull(mood1);

    }
    @Test
    public void moodTest4(){

        MoodName moodName = new MoodName();

        moodName.setMood("Happy");

        String expected = "Happy";

        Assertions.assertEquals(expected, moodName.getMood());


    }

    @Test
    public void moodTest5(){
        MoodName moodName = new MoodName();

        moodName.setMoodId(1);

        Integer expected = 1;

        Assertions.assertEquals(expected, moodName.getMoodId());
    }


    @Test
    public void testSetterMethods() {
        MoodEntry moodEntry = new MoodEntry();

        MoodName moodName = new MoodName();
        User user = new User();

        moodEntry.setMoodId(moodName);
        moodEntry.setDate(LocalDate.now());
        moodEntry.setUser(user);

        assertThat(moodEntry.getMoodId()).isEqualTo(moodName);
        assertThat(moodEntry.getDate()).isEqualTo(LocalDate.now());
        assertThat(moodEntry.getUser()).isEqualTo(user);
    }

}
