package com.rawat.customfindermethods.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Course_Table")
public class Course {

    @Id
    @Column(name = "course_Id")
    private int Course_Id;

    @Column(name = "course_Title")
    private String Course_Title;

    @ManyToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<Student> student  = new ArrayList<Student>();

    public Course() {
    }

    public Course(int course_Id, String course_Title, List<Student> student) {
        Course_Id = course_Id;
        Course_Title = course_Title;
        this.student = student;
    }

    public int getCourse_Id() {
        return Course_Id;
    }

    public void setCourse_Id(int course_Id) {
        Course_Id = course_Id;
    }

    public String getCourse_Title() {
        return Course_Title;
    }

    public void setCourse_Title(String course_Title) {
        Course_Title = course_Title;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Course_Id=" + Course_Id +
                ", Course_Title='" + Course_Title + '\'' +
                ", student=" + student +
                '}';
    }
}
