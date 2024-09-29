package com.rawat.manytomany.manytomanyassociation.Services;

import com.rawat.manytomany.manytomanyassociation.Entities.Categories;

import java.util.List;

public interface CategoriesServices {

    Categories saveCategories(Categories categories);

    Categories getCategories(int id);

    Categories updateCategories(Categories categories, int id);

    List<Categories> getAllCategories();

    void deleteCategories(int id);


}
