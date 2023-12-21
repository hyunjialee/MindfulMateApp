package Mood;
//@Entity  //need persistance.xml  and in pom
public class MoodEntry {
    // Selected entries: happy, sad, tired, mad, neutral, stressed

    //    HAPPY,
    //    SAD,
    //    TIRED,
    //    MAD,
    //    MYBALLS,
    //    STRESSED,
    //    NEUTRAL
    private Mood mood;
    private int id;
    public  MoodEntry(Mood mood){
        this.mood = mood;
    }

    public MoodEntry(Mood mood, int id) {
        this.mood = mood;
        this.id = id;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
