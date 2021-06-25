package com.assetmanagement.demo.controller;

import com.assetmanagement.demo.model.Category;
import com.assetmanagement.demo.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class catergoryController {

    @org.springframework.beans.factory.annotation.Autowired(required=true)
    categoryService categoryService;

    @GetMapping
    private Category getCategory(@PathVariable("id") int id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    private String updateAsset(Category category)
    {
        categoryService.saveOrUpdate(category);
        return category.getName();
    }


}
