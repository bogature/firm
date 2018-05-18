package com.firm.demo.DAO.order.interfaces;

import com.firm.demo.model.Directory;
import com.firm.demo.model.Order;

import java.sql.SQLException;
import java.util.List;

public interface IOrderDAO {

    public Order insertOrder(Order order);

    public Order getOrder(int id);

    public Order updateOrder(Order order) throws SQLException;

    public Order deleteOrder(int id) throws SQLException;

    public List<Order> getAll() throws SQLException;

}
