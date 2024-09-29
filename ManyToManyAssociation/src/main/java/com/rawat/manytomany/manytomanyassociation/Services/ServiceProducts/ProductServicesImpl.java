package com.rawat.manytomany.manytomanyassociation.Services.ServiceProducts;

import com.rawat.manytomany.manytomanyassociation.Entities.Products;
import com.rawat.manytomany.manytomanyassociation.Repositories.ProductsRepository;
import com.rawat.manytomany.manytomanyassociation.Services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServicesImpl implements ProductsServices {

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public Products saveProduct(Products products) {
        Products saveProduct = productsRepository.save(products);
        return saveProduct;
    }


    @Override
    public Products getProducts(int id) {
        Products ProductById = productsRepository.findById(id).orElseThrow(() -> new RuntimeException("Product ID not found"));
        return ProductById;
    }

    @Override
    public List<Products> getAllProducts() {
        List<Products> all = productsRepository.findAll();
        return all;
    }

    @Override
    public Products updateProducts(Products products, int id) {
        Products OldProduct = productsRepository.findById(id).orElseThrow(() -> new RuntimeException("Product ID not found"));
        OldProduct.setP_Name(products.getP_Name());
        OldProduct.setP_Description(products.getP_Description());

        Products saveNewProduct = productsRepository.save(OldProduct);

        return saveNewProduct;
    }

    @Override
    public void deleteProducts(int id) {
        productsRepository.deleteById(id);
    }


}
