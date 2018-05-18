package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
