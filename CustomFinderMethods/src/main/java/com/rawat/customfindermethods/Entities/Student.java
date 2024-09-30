package com.rawat.customfindermethods.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @Column(name = "studentRollNumber",length = 200)
    private int StudentRollNumber;

    @Column(name = "studentName")
    private String studentName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Course> course = new ArrayList<Course>();

    public Student() {
    }

    public Student(int studentRollNumber, String studentName, List<Course> course) {
        StudentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.course = course;
    }

    public List<Course> getCourse() {
        return course;
    }

    public int getStudentRollNumber() {
        return StudentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        StudentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentRollNumber=" + StudentRollNumber +
                ", studentName='" + studentName + '\'' +
                ", course=" + course +
                '}';
    }
}
