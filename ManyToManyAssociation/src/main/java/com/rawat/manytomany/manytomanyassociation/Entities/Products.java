package com.rawat.manytomany.manytomanyassociation.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product_Table")
public class Products {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Product_Id",length = 200)
    private int P_Id;
    @Column(name = "Product_Name",length = 200)
    private String P_Name;
    @Column(name = "Product_Description",length = 500)
    private String P_Description;

    // Many to Many
    @ManyToMany(mappedBy = "products")
    private List<Categories> categories = new ArrayList<>();

    public Products() {
    }

    public Products(int p_Id, String p_Name, String p_Description, List<Categories> categories) {
        P_Id = p_Id;
        P_Name = p_Name;
        P_Description = p_Description;
        this.categories = categories;
    }

    public int getP_Id() {
        return P_Id;
    }

    public void setP_Id(int p_Id) {
        P_Id = p_Id;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public String getP_Description() {
        return P_Description;
    }

    public void setP_Description(String p_Description) {
        P_Description = p_Description;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }


}
