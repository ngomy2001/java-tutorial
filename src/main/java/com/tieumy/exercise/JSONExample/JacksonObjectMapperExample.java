package com.tieumy.exercise.JSONExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonObjectMapperExample {
    public static void main(String[] args) throws IOException {

        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

        //create ObjectMapper instance
    }
}
