package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
