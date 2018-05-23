package com.firm.demo.service.order;

import com.firm.demo.model.Order;
import com.firm.demo.reposetory.OrderRepository;
import com.firm.demo.service.order.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order insertOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(int id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);

    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAll() throws SQLException {
        return orderRepository.findAll();
    }

    @Override
    public int getCountOrderByTypeAndDate(int status_id, Date start_time, Date finish_time) {
        return orderRepository.getCountOrderByTypeAndDate(status_id, start_time, finish_time);
    }
}
