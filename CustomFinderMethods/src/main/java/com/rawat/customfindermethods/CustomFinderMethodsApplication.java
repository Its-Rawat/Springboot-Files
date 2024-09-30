package com.rawat.customfindermethods;

import com.rawat.customfindermethods.Entities.Course;
import com.rawat.customfindermethods.Entities.Student;
import com.rawat.customfindermethods.Repositories.CourseRepositories;
import com.rawat.customfindermethods.Repositories.StudentRepositories;
import com.rawat.customfindermethods.Services.CoursesServices;
import com.rawat.customfindermethods.Services.StudentServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CustomFinderMethodsApplication implements CommandLineRunner {

    @Autowired
    CoursesServices coursesServices;
    @Autowired
    StudentServices studentServices;

    Logger logger = LoggerFactory.getLogger(CustomFinderMethodsApplication.class);
    @Autowired
    private CourseRepositories courseRepositories;
    @Autowired
    private StudentRepositories studentRepositories;

    public static void main(String[] args) {
        SpringApplication.run(CustomFinderMethodsApplication.class, args);


    }
    @Override
    public void run(String... args) throws Exception {
        logger.info(" Spring App Stated!!!...");
// Setting Students With Data
//        Student student1 = new Student();
//        student1.setStudentName("Aditya");
//        student1.setStudentRollNumber(12);
//        Student student2 = new Student();
//        student2.setStudentName("Aayush");
//        student2.setStudentRollNumber(52);
//        Student student3 = new Student();
//        student3.setStudentName("Deewanshi");
//        student3.setStudentRollNumber(23);
//// Setting Courses With Data
//        Course course1 = new Course();
//        course1.setCourse_Title("Introduction to Java");
//        course1.setCourse_Id(100);
//        Course course2 = new Course();
//        course2.setCourse_Title("Introduction to Springboot");
//        course2.setCourse_Id(101);
//        Course course3 = new Course();
//        course3.setCourse_Title("Introduction to Hibernate");
//        course3.setCourse_Id(102);
//        Course course4 = new Course();
//        course4.setCourse_Title("Introduction to C++");
//        course4.setCourse_Id(103);
//        Course course5 = new Course();
//        course5.setCourse_Title("Introduction to DSA Using Java");
//        course5.setCourse_Id(104);
//        Course course6 = new Course();
//        course6.setCourse_Title("Introduction to DSA Using C++");
//        course6.setCourse_Id(105);
//
//
//// Getting and Saving courses where  Students are enrolled.
//
//        List<Course> student1Course = student1.getCourse();
//        student1Course.add(course1);
//        student1Course.add(course2);
//        student1Course.add(course3);
//        student1Course.add(course5);
//
//        List<Course> student2Course = student2.getCourse();
//        student2Course.add(course1);
//        student2Course.add(course4);
//        student2Course.add(course6);
//
//        List<Course> student3Course = student3.getCourse();
//        student3Course.add(course1);
//        student3Course.add(course5);
//
//        // Saving Students
//        studentServices.saveStudent(student1);
//        studentServices.saveStudent(student2);
//        studentServices.saveStudent(student3);
//
//

        // Tells the Total Number of Java Courses.
        List<Course> javaCourses = courseRepositories.findJavaCourses("Java");
        logger.info("All Java Courses : {}", javaCourses.size());


        // Find by student name with prefix
        List<Student> studentNameWithA = studentRepositories.findBystudentNameStartsWith("A");
        studentNameWithA.forEach(student->{
            System.out.println(student.getStudentName());
        });

    }

}
