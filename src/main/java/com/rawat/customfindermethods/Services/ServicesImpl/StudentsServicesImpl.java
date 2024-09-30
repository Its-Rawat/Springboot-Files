package com.rawat.customfindermethods.Services.ServicesImpl;

import com.rawat.customfindermethods.Entities.Student;

import java.util.List;

public interface StudentsServicesImpl {

    Student saveStudent(Student student);

    Student updateStudent(Student student, int id);

    Student getStudent(int Student);

    List<Student> getAllStudents();

    void deleteStudents(int id);
}
