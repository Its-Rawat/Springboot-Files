package com.rawat.manytomany.manytomanyassociation.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories_Table")
public class Categories {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Category_Id",length = 200)
    private int C_Id;
    @Column(name = "Category_Name",length= 50)
    private String Category_Name;
    @Column(name = "Category_Description",length = 200)
    private String Category_Description;

    // For Saving Multiple Products

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Products> products = new ArrayList<>();


    public Categories() {
    }

    public Categories(int c_Id, String category_Name, String category_Description, List<Products> products) {
        C_Id = c_Id;
        Category_Name = category_Name;
        Category_Description = category_Description;
        this.products = products;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getC_Id() {
        return C_Id;
    }

    public void setC_Id(int c_Id) {
        C_Id = c_Id;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }

    public String getCategory_Description() {
        return Category_Description;
    }

    public void setCategory_Description(String category_Description) {
        Category_Description = category_Description;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "C_Id=" + C_Id +
                ", Category_Name='" + Category_Name + '\'' +
                ", Category_Description='" + Category_Description + '\'' +
                ", products=" + products +
                '}';
    }
}
