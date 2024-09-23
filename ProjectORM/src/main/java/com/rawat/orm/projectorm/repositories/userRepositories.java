package com.rawat.orm.projectorm.repositories;

import com.rawat.orm.projectorm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepositories extends JpaRepository<User,Integer> {

}
