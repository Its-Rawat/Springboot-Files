package com.rawat.orm.projectorm.entities;

import jakarta.persistence.*;

@Entity
@Table(name="laptop_Table")
public class Laptop {

    @Id
    @Column(name="Laptop_Id",length=200)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int LaptopId;

    @Column(name="Laptop_Name", length=50)
    private String LaptopName;


    // Constructors, Getters and Setters, toString()

    public Laptop() {
    }

    public Laptop(int laptopId, String laptopName) {
        LaptopId = laptopId;
        LaptopName = laptopName;
    }

    public int getLaptopId() {
        return LaptopId;
    }

    public void setLaptopId(int laptopId) {
        LaptopId = laptopId;
    }

    public String getLaptopName() {
        return LaptopName;
    }

    public void setLaptopName(String laptopName) {
        LaptopName = laptopName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LaptopId=" + LaptopId +
                ", LaptopName='" + LaptopName + '\'' +
                '}';
    }
}
