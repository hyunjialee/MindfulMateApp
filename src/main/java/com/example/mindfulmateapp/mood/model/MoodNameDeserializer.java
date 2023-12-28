package com.example.mindfulmateapp.mood.model;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class MoodNameDeserializer extends JsonDeserializer<MoodName> {


    @Override
    public MoodName deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        JsonNode node = p.getCodec().readTree(p);
        Integer moodId = node.get("moodId").asInt();
        String moodName = node.get("mood").asText();

        MoodName mood = new MoodName();
        mood.setMood(moodName);
        mood.setMoodId(moodId);

        return mood;
    }
}
