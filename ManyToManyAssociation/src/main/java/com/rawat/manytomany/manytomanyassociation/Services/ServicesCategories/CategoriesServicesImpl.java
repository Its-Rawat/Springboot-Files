package com.rawat.manytomany.manytomanyassociation.Services.ServicesCategories;

import com.rawat.manytomany.manytomanyassociation.Entities.Categories;
import com.rawat.manytomany.manytomanyassociation.Repositories.CategoriesRepository;
import com.rawat.manytomany.manytomanyassociation.Services.CategoriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServicesImpl implements CategoriesServices {

    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public Categories saveCategories(Categories categories) {
        Categories saveCategory = categoriesRepository.save(categories);
        return saveCategory;
    }

    @Override
    public Categories getCategories(int id) {
        Categories byId = categoriesRepository.findById(id).orElseThrow(()->new RuntimeException("ID not Found"));
        return byId;
    }

    @Override
    public Categories updateCategories(Categories categories, int id) {
        Categories OldCategory = categoriesRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not Found"));
        OldCategory.setCategory_Name(categories.getCategory_Name());
        OldCategory.setCategory_Description(categories.getCategory_Description());
        Categories UpdatedCategory = categoriesRepository.save(OldCategory);
        return UpdatedCategory;
    }

    @Override
    public List<Categories> getAllCategories() {
        List<Categories> all = categoriesRepository.findAll();
        return all;
    }

    @Override
    public void deleteCategories(int id) {
    categoriesRepository.deleteById(id);
    }
}
