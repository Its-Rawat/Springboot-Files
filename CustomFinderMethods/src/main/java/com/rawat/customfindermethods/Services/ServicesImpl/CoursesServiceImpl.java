package com.rawat.customfindermethods.Services.ServicesImpl;

import com.rawat.customfindermethods.Entities.Course;

import java.util.List;

public interface CoursesServiceImpl {

    Course saveCourse(Course course);

    Course getCourse(int id);

    List<Course> getAllCourse();

    Course updateCourse(Course course, int Id);

    void deleteCourse(int id);

}
