package com.firm.demo.controller;

import com.firm.demo.model.Category;
import com.firm.demo.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> showCategory() throws SQLException {
        return categoryService.getAll();
    }

    @PostMapping("/category/insert")
    public Category insert(@RequestBody Category category) {
        System.out.printf(category.getName());
        return categoryService.insertCategory(category);
    }


    @RequestMapping("/category/del")
    public void del(@RequestParam("id") int id){
        categoryService.deleteCategory(id);
    }

    @RequestMapping("/category/update")
    public Category update(@RequestBody Category category, @RequestParam("id") int id) {
        category.setId(id);
        return categoryService.updateCategory(category);
    }

    @GetMapping("/category/get")
    Category get(@RequestParam("id") int id) {
        return categoryService.getCategory(id);
    }

}
