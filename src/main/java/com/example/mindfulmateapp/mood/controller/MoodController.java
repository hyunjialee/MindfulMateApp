package Mood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoodController {
    //handles end points

    @Autowired
    private MoodRepository repostiory;

//    @GetMapping
//    public MoodEntry
}
