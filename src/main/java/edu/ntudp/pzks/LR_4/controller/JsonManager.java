package edu.ntudp.pzks.LR_4.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ntudp.pzks.LR_4.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveToJsonFile(University university, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University loadFromJsonFile(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
