package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Center;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepository extends JpaRepository<Center, Integer> {
}
