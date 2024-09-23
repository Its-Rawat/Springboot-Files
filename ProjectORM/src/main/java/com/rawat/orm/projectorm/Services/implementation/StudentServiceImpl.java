package com.rawat.orm.projectorm.Services.implementation;

import com.rawat.orm.projectorm.Services.StudentService;
import com.rawat.orm.projectorm.entities.Student;
import com.rawat.orm.projectorm.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
    @Override
    public Student getStudentById(int id){
        Student studentById = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return studentById;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student updateStudent(Student student, int Id) {
        return null;
    }
    @Override
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }


}
