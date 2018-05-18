package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

    @Query("select c from Provider c where c.category = :categorys_id")
    List<Provider> getProvidersByCategoryAndType(@Param("categorys_id") int categorys_id);

}
