package com.rawat.orm.projectorm.Services;

import com.rawat.orm.projectorm.entities.Student;

import java.util.List;

public interface StudentService {

     Student saveStudent(Student student);

     Student getStudentById(int Id);

     List<Student> getAllStudents();

     Student updateStudent(Student student, int Id);

     void deleteStudent(int Id);
}
