package com.firm.demo.service.order.interfaces;

import com.firm.demo.model.Order;
import com.firm.demo.model.Product;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface IOrderService {
    Order insertOrder(Order order);

    Order getOrder(int id);

    Order updateOrder(Order order);

    void deleteOrder(int id);

    List<Order> getAll() throws SQLException;

    int getCountOrderByTypeAndDate(int status_id, Date start_time, Date finish_time);

}
