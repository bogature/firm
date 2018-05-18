package com.firm.demo.service.category.interfaces;

import com.firm.demo.model.Category;
import com.firm.demo.model.Type;

import java.sql.SQLException;
import java.util.List;

public interface ICategoryService {

    Category insertCategory(Category category);

    Category getCategory(int id);

    Category updateCategory(Category category);

    void deleteCategory(int id);

    List<Category> getAll() throws SQLException;

}
