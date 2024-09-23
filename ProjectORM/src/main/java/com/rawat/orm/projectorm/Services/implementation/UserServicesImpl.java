package com.rawat.orm.projectorm.Services.implementation;

import com.rawat.orm.projectorm.Services.UserService;
import com.rawat.orm.projectorm.entities.User;
import com.rawat.orm.projectorm.repositories.userRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private userRepositories userrepository;

    Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public User SaveUser(User user) {
       User SavedUser = userrepository.save(user);
       logger.info("User "+SavedUser+" with ID {}",SavedUser.getId());
       return SavedUser;
    }

    @Override
    public User updateUser(User user, int userId) {
        // we will Insert New user into oldUser
       User oldUser = userrepository.findById(userId).orElseThrow(()->new RuntimeException("User with ID "+userId+ " not Found"));
       oldUser.setName(user.getName());
       oldUser.setAge(user.getAge());
       oldUser.setCity(user.getCity());
       // Saving to Database
        User UpdatedUser = userrepository.save(oldUser);
        logger.info("User Updated");
       return UpdatedUser;
    }

    @Override
    public void deleteUser(int userId) {
         userrepository.deleteById(userId);

    }

    @Override
    public List<User> getAllUser() {
        List<User> allUsers = userrepository.findAll();
        return allUsers;
    }

    @Override
    public User getUser(int userId) {
        User singleUser = userrepository.findById(userId).orElseThrow(() -> new RuntimeException("No User with this ID Found"));
        return singleUser;
    }
}
