package com.firm.demo.reposetory;

import com.firm.demo.model.Country;
import com.firm.demo.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {
}
