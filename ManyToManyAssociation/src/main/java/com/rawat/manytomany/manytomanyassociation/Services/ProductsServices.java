package com.rawat.manytomany.manytomanyassociation.Services;

import com.rawat.manytomany.manytomanyassociation.Entities.Products;

import java.util.List;

public interface ProductsServices {

    Products saveProduct(Products products);

    Products getProducts(int id);

    List<Products> getAllProducts();

    Products updateProducts(Products products, int id);

    void deleteProducts(int id);

}
