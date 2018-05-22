package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Query("select prod from Product prod where prod.type.id = :type_id and prod.provider.id = :provider_id and prod.price = :price")
    List<Product> getProductByTypeAndProviderAndPrice(@Param("type_id") int type_id, @Param("provider_id") int provider_id, @Param("price") float price);

    @Query("select prod from Product prod where prod.type.id = :type_id and prod.status.id = :status_id ")
    List<Product> getProductByTypeAndStatus(@Param("type_id") int type_id, @Param("status_id") int status_id);

    @Query(" select count (prod) from Product prod where prod.status.id = :status_id and prod.type.id = :type_id ")
    int getCountProductByTypeAndStatus(@Param("status_id") int status_id, @Param("type_id") int type_id);

    @Query("select ord.product from Order ord group by ord.product.id order by ( count (ord) ) desc ")
    List<Product> getProductByFamous();

}
