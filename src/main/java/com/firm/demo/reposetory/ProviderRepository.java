package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Provider;
import com.firm.demo.model.Product;
import com.firm.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {

//    Query 1
    @Query(" select prod.provider from Product prod  where  prod.provider.category.id = :categorys_id and prod.type.id = :type_id group by prod.provider.id  ")
    List<Provider> getProvidersByCategoryAndType(@Param("categorys_id") int categorys_id, @Param("type_id") int type_id);

//    Query 2
    @Query(" select ord.product.provider from Order ord where ord.time >= :timerStart and ord.time <= :timerFinish and ord.amount >= :amount group by ord.product.provider.id ")
    List<Provider> getProvidersByTimerAndCount(@Param("timerStart") Date timerStart, @Param("timerFinish") Date timerFinish, @Param("amount") int amount);


//    Query 16
    @Query(" select def.product.provider from Defect def where def.product.id = :product_id group by def.product.id")
    List<Provider> getProvidersByDefect(@Param("product_id") int product_id);


//    Query 12
    @Query(" select sum(pr.price)  from Product pr where pr.provider.id = :provider")
    float getCountProviderByPrice(@Param("provider") int provider);


    //    Query 11
    @Query(" select count (pr) from Product pr where pr.provider.id = :provider")
    float getCountProviderByProcent(@Param("provider") int provider);

    @Query(" select count (pr) from Product pr")
    int getCountAllProduct();
}
