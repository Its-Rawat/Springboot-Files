package com.rawat.customfindermethods.Services;

import com.rawat.customfindermethods.Entities.Student;
import com.rawat.customfindermethods.Repositories.StudentRepositories;
import com.rawat.customfindermethods.Services.ServicesImpl.StudentsServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices implements StudentsServicesImpl {

    @Autowired
    StudentRepositories studentRepositories;

    Logger logger = LoggerFactory.getLogger(StudentServices.class);

    @Override
    public Student saveStudent(Student student) {
        Student savedStudent = studentRepositories.save(student);
        logger.info("Student saved: " + savedStudent);
        return savedStudent;
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Student oldStudent = studentRepositories.findById(id).orElseThrow(() -> new RuntimeException("Student ID Not Found.."));
        oldStudent.setStudentName(student.getStudentName());
        Student updatedStudent = studentRepositories.save(oldStudent);
        return updatedStudent;
    }

    @Override
    public Student getStudent(int Student) {
        Student student = studentRepositories.findById(Student).orElseThrow(() -> new RuntimeException("Student ID Not Found.."));
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> allStudents = studentRepositories.findAll();
        return allStudents;
    }

    @Override
    public void deleteStudents(int id) {
        studentRepositories.deleteById(id);
    }

}
