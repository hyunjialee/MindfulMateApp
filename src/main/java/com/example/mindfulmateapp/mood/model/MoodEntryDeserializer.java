//package com.example.mindfulmateapp.mood.model;
//
//import com.fasterxml.jackson.core.JacksonException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//
//public class MoodEntryDeserializer extends JsonDeserializer {
//    @Override
//    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
//        JsonNode node = p.getCodec().readTree(p);
//
//        final ObjectMapper objectMapper = new ObjectMapper();
//        final ObjectMapper om2 = new ObjectMapper();
//        Integer entryId = node.get("entryId").asInt();
//
//        MoodName readMood = objectMapper.readValue()
//        String jsonArray = objectMapper.writeValueAsString(node.get("moodId"));
//
//
//        String date = node.get("date").asText();
//        String jsonArray2 = om2.writeValueAsString("userId");
//
//
//        MoodEntry moodEntry = new MoodEntry();
//
//        moodEntry.setEntryId(entryId);
//        moodEntry.setMoodId(objectMapper.constructType(MoodName));
//
//
//    }
//}
