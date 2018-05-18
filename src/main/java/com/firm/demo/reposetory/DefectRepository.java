package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectRepository extends JpaRepository<Defect, Integer> {
}
