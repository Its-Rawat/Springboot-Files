package com.rawat.orm.projectorm.repositories;

import com.rawat.orm.projectorm.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
