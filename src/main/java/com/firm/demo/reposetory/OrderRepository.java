package com.firm.demo.reposetory;

import com.firm.demo.model.Category;
import com.firm.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface OrderRepository extends JpaRepository<Order, Integer> {

//    Query 10
    @Query(" select count (ord) from Order ord where ord.product.type.id = :status_id and ord.time >= :start_time and ord.time <= :finish_time")
    int getCountOrderByTypeAndDate(@Param("status_id") int status_id, @Param("start_time") Date start_time, @Param("finish_time") Date finish_time);

}
