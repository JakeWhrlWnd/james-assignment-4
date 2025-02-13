package com.coursesortingapp.app;

import com.coursesortingapp.service.StudentService;
import com.coursesortingapp.model.Student;

import java.util.List;


public class StudentSortingApplication {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        studentService.read("src/com/coursesortingapp/data/student-master-list.csv");

        String[] courses = {"COMPSCI","APMTH","STAT"};
        int courseCounter = 1;
        for (String course : courses) {
            List<Student> students = studentService.separateByCourse(course);
            studentService.sortByDescendingGrade(students);
            studentService.write("course" + courseCounter++ + ".csv", students);
        }
    }
}
