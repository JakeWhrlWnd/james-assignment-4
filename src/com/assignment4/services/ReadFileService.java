package com.assignment4.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.assignment4.models.Student;

public class ReadFileService {

    public List<Student> readFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine();
            Student student;
            while ((student. = bufferedReader.readLine()) != null) {
                students.add(line);
            }
        } catch (IOException e) {
            System.out.println("Oops, there was an issue reading the file. Issue -> " + e.getMessage());
        }
        return students;
    }
}
