package com.rawat.orm.projectorm.Services;

import com.rawat.orm.projectorm.entities.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User SaveUser(User user);

    User updateUser(User user, int userId);

    void deleteUser(int userId);

    List<User> getAllUser();

    User getUser(int userId);
}
