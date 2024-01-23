package com.example.mindfulmateapp.mood.model;


public enum Mood {
    HAPPY (1),
    SAD(2),
    ANGRY(3),
    EXCITED(4),
    RELAXED(5),
    STRESSED(6),
    CONTENT(7),
    TIRED(8);

    private final int number;

    Mood(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
