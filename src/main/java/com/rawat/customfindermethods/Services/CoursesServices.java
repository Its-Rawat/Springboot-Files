package com.rawat.customfindermethods.Services;

import com.rawat.customfindermethods.Entities.Course;
import com.rawat.customfindermethods.Repositories.CourseRepositories;
import com.rawat.customfindermethods.Services.ServicesImpl.CoursesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServices implements CoursesServiceImpl {

    @Autowired
    CourseRepositories courseRepositories;

    @Override
    public Course saveCourse(Course course) {
        Course savedCourse = courseRepositories.save(course);
        return savedCourse;
    }

    @Override
    public Course getCourse(int id) {
        Course course = courseRepositories.findById(id).orElseThrow(() -> new RuntimeException("Course ID not Found.."));
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> allCourses = courseRepositories.findAll();
        return allCourses;
    }

    @Override
    public Course updateCourse(Course course, int id) {
        Course Oldcourse = courseRepositories.findById(id).orElseThrow(() -> new RuntimeException("Course ID not Found.."));
        Oldcourse.setCourse_Title(course.getCourse_Title());
        Course updatedCourse = courseRepositories.save(Oldcourse);
        return updatedCourse;
    }

    @Override
    public void deleteCourse(int id) {
        courseRepositories.deleteById(id);
    }

}
