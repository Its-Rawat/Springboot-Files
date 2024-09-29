package com.rawat.manytomany.manytomanyassociation.Repositories;

import com.rawat.manytomany.manytomanyassociation.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer> {

}
