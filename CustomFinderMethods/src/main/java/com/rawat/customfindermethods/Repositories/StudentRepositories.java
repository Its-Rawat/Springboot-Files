package com.rawat.customfindermethods.Repositories;

import com.rawat.customfindermethods.Entities.Course;
import com.rawat.customfindermethods.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

public interface StudentRepositories extends JpaRepository<Student,Integer> {

//                                    //  Custom Finder Methods
//
//    //Everything in Camel Case
//
//    // It will be used to find the 'studentName' from the table.
    List<Student> findBystudentName(String StudentName);
//    //Alternative
    List<Student> findBystudentNameIs(String StudentName);


//    // Finds the Student Name from Table
    Student findBystudentNameEquals(String studentName);
//
//    // Finds All StudentNames except studentName.
    List<Student> findBystudentNameNot(String studentName);
//
//    // If Your Field is Boolean then, Assume Active is a private boolean Active; in Entity.
//    List<Student> findByActiveTrue();
//    List<Student> findByActiveFalse();
//
    // finds all StudentNames starting with Prefix.
    List<Student> findBystudentNameStartsWith(String Prefix);
//
//    // finds all StudentNames Ending with Suffix.
    List<Student> findBystudentNameEndingWith(String Suffix);
//
//    // finds all StudentNames Having Infix in Between there Names.
    List<Student> findBystudentNameContaining(String Infix);
//
//    // finds Names with Given pattern , Example of Pattern String pattern = "%Rawat"; --> Means ends with Rawat.
    List<Student> findBystudentNameLike(String Pattern);
//
//    // finds Students with Roll Number Less then to number.
//    List<Student> findByStudentRollNumberLessThan(int number);
//    // finds Students with Roll Number Greater then Equals to number.
//    List<Student> findByStudentRollNumberGreaterThanEqual(int number);
//
//    // finds all the names in the collection and saved all of them in List.
    List<Student> findBystudentNameIn(Collection<String> studentNames);
//
//    // finds all the names which are active = true.
//    List<Student> findByStudentRollNumberLessThan(int studentRollNumber);
//
//    // finds studentNames from table and Order them using there Roll Number.
//    List<Student> findByStudentNameOrderByStudentRollNumberAsc(String studentName);

}

