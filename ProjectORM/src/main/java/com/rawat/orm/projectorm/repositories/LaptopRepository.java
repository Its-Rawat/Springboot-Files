package com.rawat.orm.projectorm.repositories;

import com.rawat.orm.projectorm.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
