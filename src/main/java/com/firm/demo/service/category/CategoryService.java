package com.firm.demo.service.category;

import com.firm.demo.model.Category;
import com.firm.demo.model.Type;
import com.firm.demo.reposetory.CategoryRepository;
import com.firm.demo.reposetory.TypeRepository;
import com.firm.demo.service.category.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category insertCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAll() throws SQLException {
        return categoryRepository.findAll();
    }

}
