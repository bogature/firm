package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
