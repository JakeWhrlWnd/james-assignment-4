package com.assignment4.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileService {

    public void writeFile(String fileName, List<String> lines) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write("Models.Student ID,Models.Student Name,Course,Grade\n");
            for (String line : lines) {
                bufferedWriter.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue writing the file. Issue -> " + e.getMessage());
        }
    }
}
