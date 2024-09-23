package com.rawat.orm.projectorm.Services.implementation;

import com.rawat.orm.projectorm.Services.LaptopService;
import com.rawat.orm.projectorm.entities.Laptop;
import com.rawat.orm.projectorm.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public Laptop SaveLaptop(Laptop laptop) {
        Laptop savedLaptop = laptopRepository.save(laptop);
        return savedLaptop;
    }

    @Override
    public Laptop GetLaptop(int id) {
        Laptop getSinglelaptop = laptopRepository.findById(id).orElseThrow(() -> new RuntimeException("No Laptop Found with this ID"));
        return getSinglelaptop;
    }

    @Override
    public List<Laptop> GetAllLaptops() {
        return List.of();
    }

    @Override
    public Laptop UpdateLaptop(Laptop laptop, int Id) {
        Laptop oldLaptop = laptopRepository.findById(Id).orElseThrow(() -> new RuntimeException("Laptop not found"));
        oldLaptop.setLaptopName(laptop.getLaptopName());
        Laptop updatedLaptop = laptopRepository.save(oldLaptop);
        return updatedLaptop;
    }

    @Override
    public void DeleteLaptop(int Id) {
        laptopRepository.deleteById(Id);
    }
}
