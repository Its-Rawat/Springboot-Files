package com.rawat.orm.projectorm.Services;

import com.rawat.orm.projectorm.entities.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop SaveLaptop(Laptop laptop);

    Laptop GetLaptop(int id);

    List<Laptop> GetAllLaptops();

    Laptop UpdateLaptop(Laptop laptop, int Id);

    void DeleteLaptop(int Id);
}
