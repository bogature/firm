package com.firm.demo.controller;

import com.firm.demo.model.Center;
import com.firm.demo.model.Order;
import com.firm.demo.model.Provider;
import com.firm.demo.service.center.CenterService;
import com.firm.demo.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/order")
    public List<Order> showOrder() throws SQLException {
        return orderService.getAll();
    }

    @RequestMapping("/order/del")
    public void delCountry(@RequestParam("id") int id){
        orderService.deleteOrder(id);
    }

    @RequestMapping("/order/update")
    public Order update(@RequestBody Order order, @RequestParam("id") int id) {
        order.setId(id);
        return orderService.updateOrder(order);
    }

    @GetMapping("/order/get")
    Order getGroupById(@RequestParam("id") int id) {
        return orderService.getOrder(id);
    }

    @PostMapping("/order/insert")
    public Order insertStreet(@RequestBody Order order) {
        return orderService.insertOrder(order);
    }

}
