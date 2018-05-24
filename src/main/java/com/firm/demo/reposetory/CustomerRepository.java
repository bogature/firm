package com.firm.demo.reposetory;

import com.firm.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

//    Query 4
    @Query("select ord.customer from Order ord where ord.product.type.id = :type_id and ord.time >= :startTime and ord.time <= :finishTime group by ord.customer.id")
    List<Customer> getCustomerByTypeAndDate(@Param("startTime") Date startTime , @Param("finishTime") Date finishTime , @Param("type_id") int type_id);

//    Query 5
    @Query("select ord.customer from Order ord where ord.product.id = :product_id and ord.amount >= :amount group by ord.customer.id ")
    List<Customer> getCustomerByTypeAndPrice(@Param("product_id") int product_id, @Param("amount") int amount);

}
