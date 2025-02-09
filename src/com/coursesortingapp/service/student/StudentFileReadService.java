package com.coursesortingapp.service.student;

import com.coursesortingapp.model.Student;
import com.coursesortingapp.service.file.FileReadService;

import java.util.ArrayList;
import java.util.List;

public class StudentFileReadService {

    public List<Student> students = new ArrayList<>();
    private final FileReadService fileReadService = new FileReadService();

    public void readStudents(String filename) {
        List<String> lines = fileReadService.readFile(filename);
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    try {
                        int studentID = Integer.parseInt(fields[0].trim());
                        String studentName = fields[1].trim();
                        String course = fields[2].trim();
                        int grade = Integer.parseInt(fields[3].trim());

                        students.add(new Student(studentID, studentName, course, grade));
                    } catch (NumberFormatException e) {
                        System.out.println("Oops, there was issue parsing the student data. Issue -> " + e.getMessage());
                    }
                } else {
                    System.out.println("Oops, the data is invalid. Issue -> " + line);
                }
            }
        }
    }
}
