package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
