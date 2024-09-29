package com.rawat.manytomany.manytomanyassociation.Repositories;

import com.rawat.manytomany.manytomanyassociation.Entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories,Integer>{
}
