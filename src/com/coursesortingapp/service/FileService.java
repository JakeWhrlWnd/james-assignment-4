package com.coursesortingapp.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public List<String> read(String filename) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue reading your file. Issue -> " + e.getMessage());
        }
        return lines;
    }

    public void write(String filename, List<String> lines) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/coursesortingapp/data/" + filename))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue writing to the file. Issue -> " + e.getMessage());
        }
    }
}
