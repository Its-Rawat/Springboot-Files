package com.rawat.orm.projectorm;

import com.rawat.orm.projectorm.Services.LaptopService;
import com.rawat.orm.projectorm.Services.StudentService;
import com.rawat.orm.projectorm.Services.UserService;
import com.rawat.orm.projectorm.entities.Laptop;
import com.rawat.orm.projectorm.entities.Student;
import com.rawat.orm.projectorm.entities.User;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjectOrmApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(ProjectOrmApplication.class);

    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;

    @Autowired
    LaptopService laptopService;

    public static void main(String[] args) {
        SpringApplication.run(ProjectOrmApplication.class, args);
        System.out.println("Hello Spring JPA");

    }

    @Override
    public void run(String... args) throws Exception {

        // Saving New User
//         User user = new User();
//        user.setAge(20);
//        user.setCity("Almora");
//        user.setName("Isha");
//        User SavedUser = userService.SaveUser(user);
//        userService.SaveUser(SavedUser);


        // Update User
        // Creating a New User which will update old User
//        User user = new User();
//        user.setName("Deewanshi");
//        user.setAge(21);
//        user.setCity("Delhi");
//        User updatedUser = userService.updateUser(user, 252);
//        logger.info("Updated User Details {}",updatedUser);

        // Delete User by ID
//        userService.deleteUser(354);
//        logger.info("User Deleted");

        // get All Users
//        List<User> allUser = userService.getAllUser();
//        logger.info("All User {}",allUser);

        // get Single User

//        User getSingleUser = userService.getUser(352);
//        logger.info("User Found {}",getSingleUser);

// OneToOne Operations Uni- Directional
//
//        Student student = new Student();
//        Laptop laptop = new Laptop();
//        student.setStudentName("Deewanshi");
//        student.setStudentAddress("Delhi");
//        laptop.setLaptopName("MAC 12");
////         Saving the laptop Using Student
//        student.setLaptop(laptop);
////         Saving Student
//        studentService.saveStudent(student);


        // fetching laptop using student
//        Student studentById = studentService.getStudentById(student.getStudentId());
//        Student studentById = studentService.getStudentById(52);
//        Laptop Gettinglaptop = studentById.getLaptop();
//        logger.info("Getting laptop through Student entity Using Uni-Directional OneToOne Mapping {}", Gettinglaptop);

        // Update Laptop
//        Gettinglaptop.setLaptopName("Dell Pro Max");
//        Laptop UpdatedLaptop = laptopService.UpdateLaptop(Gettinglaptop, studentById.getStudentId());
//        logger.info("Updated laptop {}",UpdatedLaptop);

        // Delete Laptop
//        int laptopId = Gettinglaptop.getLaptopId();
//        System.out.println(laptopId);

// Remove the Reference Before Deletion: Before you delete the Laptop, you need to ensure that no Student references it. This can be achieved by setting the laptop field of the Student to null before you delete the Laptop.
//        studentById.setLaptop(null);
//        studentService.saveStudent(studentById);
// Now Delete Laptop
//        laptopService.DeleteLaptop(laptopId);
    }
}
