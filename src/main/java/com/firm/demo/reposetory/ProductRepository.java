package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
