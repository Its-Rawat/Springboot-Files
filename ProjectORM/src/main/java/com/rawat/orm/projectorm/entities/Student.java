package com.rawat.orm.projectorm.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id",length = 200)
    private int StudentId;

    @Column(name = "Student_Name", length = 20)
    private String StudentName;

    @Column(name="Student_Address", length = 20)
    private String StudentAddress;

    // Laptop as a Foreign Key in this Table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Laptop_Id") // Foreign Key in Owning Entity
    private Laptop laptop;


    // Constructors, Getters and Setters, toString()


    public Student() {
    }

    public Student(int studentId, String studentName, String studentAddress, Laptop laptop) {
        StudentId = studentId;
        StudentName = studentName;
        StudentAddress = studentAddress;
        this.laptop = laptop;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }



    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
