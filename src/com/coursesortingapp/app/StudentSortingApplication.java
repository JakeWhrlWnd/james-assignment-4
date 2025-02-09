package com.coursesortingapp.app;

import com.coursesortingapp.service.student.StudentFileReadService;
import com.coursesortingapp.service.student.StudentFileSortService;
import com.coursesortingapp.service.student.StudentFileWriteService;
import com.coursesortingapp.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentSortingApplication {

    public static void main(String[] args) {

        StudentFileReadService studentFileReadService = new StudentFileReadService();
        studentFileReadService.readStudents("src/com/coursesortingapp/data/student-master-list.csv");

        List<Student> compsciStudents = new ArrayList<>();
        List<Student> apmthStudents = new ArrayList<>();
        List<Student> statStudents = new ArrayList<>();

        for (Student student : studentFileReadService.students) {
            if (student.getCourse().startsWith("COMPSCI")) {
                compsciStudents.add(student);
            } else if (student.getCourse().startsWith("APMTH")) {
                apmthStudents.add(student);
            } else if (student.getCourse().startsWith("STAT")) {
                statStudents.add(student);
            }
        }

        StudentFileSortService studentFileSortService = new StudentFileSortService();
        studentFileSortService.sortStudentsByDescendingGrade(compsciStudents);
        studentFileSortService.sortStudentsByDescendingGrade(apmthStudents);
        studentFileSortService.sortStudentsByDescendingGrade(statStudents);

        StudentFileWriteService studentFileWriteService = new StudentFileWriteService();
        studentFileWriteService.writeStudents("course1.csv", compsciStudents);
        studentFileWriteService.writeStudents("course2.csv", apmthStudents);
        studentFileWriteService.writeStudents("course3.csv", statStudents);
    }
}
