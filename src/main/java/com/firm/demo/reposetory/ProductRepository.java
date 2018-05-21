package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select prod from Product prod where prod.time = :time")
    List<Product> getProductByDay(@Param("time") Date time);

    @Query("select count (ord) from Order ord where ord.time = :time")
    int getCountProductByDay(@Param("time") Date time);

    @Query("select sum(ord.product.price * ord.amount) from Order ord where ord.time = :time")
    float getPriceProductByDay(@Param("time") Date time);

    @Query("select count (prod) from Product prod where prod.status.id = :status")
    int getCountProductNoByStatus(@Param("status") int status);

}
