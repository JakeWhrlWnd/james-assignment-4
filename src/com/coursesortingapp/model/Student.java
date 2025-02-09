package com.coursesortingapp.model;

public class Student {
    // Will convert to a record after review
    private final int studentID;
    private final String studentName;
    private final String course;
    private final int grade;

    public Student(int studentID, String studentName, String course, int grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return studentID + "," + studentName + "," + course + "," + grade;
    }
}
