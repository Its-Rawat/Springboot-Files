package com.rawat.manytomany.manytomanyassociation;

import com.rawat.manytomany.manytomanyassociation.Entities.Categories;
import com.rawat.manytomany.manytomanyassociation.Entities.Products;
import com.rawat.manytomany.manytomanyassociation.Repositories.CategoriesRepository;
import com.rawat.manytomany.manytomanyassociation.Services.CategoriesServices;
import com.rawat.manytomany.manytomanyassociation.Services.ProductsServices;
import com.rawat.manytomany.manytomanyassociation.Services.ServiceProducts.ProductServicesImpl;
import com.rawat.manytomany.manytomanyassociation.Services.ServicesCategories.CategoriesServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ManyToManyAssociationApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(ManyToManyAssociationApplication.class);

    @Autowired
    private CategoriesServicesImpl categoriesServicesImpl;


    public static void main(String[] args) {
        SpringApplication.run(ManyToManyAssociationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        // Saving Products

        Products products = new Products();
        products.setP_Name("MI 14 Laptop");
        products.setP_Id(100);
        products.setP_Description("8 GB RAM 256 GB SSD");

        Products products1 = new Products();
        products1.setP_Name("ASUS R1 Pro");
        products1.setP_Id(101);
        products1.setP_Description("16 GB RAM 556 GB HDD");

        Products products2 = new Products();
        products2.setP_Name("HP Inspiron");
        products2.setP_Id(102);
        products2.setP_Description("8 GB RAM 1TB HDD");

        Products products3 = new Products();
        products3.setP_Name("POCO M2 Pro");
        products3.setP_Id(103);
        products3.setP_Description("6 GB RAM 256GB");

        Products products4 = new Products();
        products4.setP_Name("IPhone 15 Pro Max");
        products4.setP_Id(104);
        products4.setP_Description("16 GB RAM 2TB");


//         Saving to Categories Entity
        Categories categories = new Categories();
        categories.setCategory_Name("Electronics");
        categories.setC_Id(001);
        categories.setCategory_Description("Its About Electronics");

        Categories categories1 = new Categories();
        categories1.setCategory_Name("Mobile/Tablets");
        categories1.setC_Id(002);
        categories1.setCategory_Description("Its About Mobiles and Tablets");

        List<Products> categoriesProduct = categories.getProducts();
        categoriesProduct.add(products);
        categoriesProduct.add(products1);
        categoriesProduct.add(products2);
        categoriesProduct.add(products3);
        categoriesProduct.add(products4);

        List<Products> categories1products = categories1.getProducts();
        categories1products.add(products3);
        categories1products.add(products4);


        categoriesServicesImpl.saveCategories(categories);
        categoriesServicesImpl.saveCategories(categories1);

        logger.info("Category Saved {} with ID {}", categories.getCategory_Name(), categories.getC_Id());
        logger.info("Category Saved {} with ID {}", categories1.getCategory_Name(), categories1.getC_Id());

        Categories categories001 = categoriesServicesImpl.getCategories(002);
        logger.info(" {}", categories001.getProducts().size());


    }
}
