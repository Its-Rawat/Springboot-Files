package com.rawat.customfindermethods.Repositories;

import com.rawat.customfindermethods.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepositories extends JpaRepository<Course,Integer> {

    // Finder Query Annotation for creating your custom query..


    // Find All Courses with @Query.
    // Java Persistent Query Language (JPQL).

    @Query(value="SELECT c FROM Course c")
    List<Course> findAllCourses();

    // Find all Courses Related to Java.
    @Query("SELECT c FROM Course c Where c.Course_Title Like %:keyword%  OR c.Course_Title Like %:keyword OR c.Course_Title Like :keyword%")
    List<Course> findJavaCourses(@Param("keyword") String keyword);

    // Find Single Course By ID and Name.
    @Query(value = "SELECT c FROM Course c WHERE c.Course_Id = ?1 AND c.Course_Title = ?2")
    Course getCourseByIdAndCourseName(int Course_Id, String Course_Title);

    // Other way to create query
    // Native Queries

    @Query(value = "SELECT * FROM Course_Table Where course_Title = :courseTitle",nativeQuery = true)
    Course getCourseByIdAndNameNative(@Param("courseTitle") String courseTitle);

}
