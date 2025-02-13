package com.coursesortingapp.service;

import com.coursesortingapp.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService {

    public List<Student> students = new ArrayList<>();
    private final FileService fileService = new FileService();

    public void read(String filename) {
        List<String> lines = fileService.read(filename);
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


    public void sortByDescendingGrade(List<Student> students) {
        students.sort(Comparator.nullsLast(Comparator.comparing(Student::getGrade).reversed()));
    }

    public void write(String filename, List<Student> students) {
        List<String> lines = new ArrayList<>();
        lines.add("Student ID,Student Name,Course,Grade");
        for (Student student : students) {
            if (student != null) {
                lines.add(student.toString());
            }
        }
        fileService.write(filename, lines);
    }

    public List<Student> separateByCourse(String course) {
        List<Student> studentsByCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse().startsWith(course)) {
                studentsByCourse.add(student);
            }
        }
        return studentsByCourse;
    }
}
