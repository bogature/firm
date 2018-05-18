package com.firm.demo.DAO.order;

import com.firm.demo.DAO.order.interfaces.IOrderDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Order;
import com.firm.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDAOJDBCImpl implements IOrderDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Order> list = new ArrayList<>();


    @Override
    public Order insertOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public Order updateOrder(Order order) throws SQLException {
        return null;
    }

    @Override
    public Order deleteOrder(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Order> getAll() throws SQLException {
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("select * from orders inner join product on product_id = product.id inner join customer on customer_id = customer.id ");
//        while(rs.next()){
//            list.add(new Order(
//                            rs.getInt("orders.id"),
////                            new Product(3,"name", null),
//                            new Product(rs.getInt("product.id"),rs.getString("product.product_name"),null),
//                            new Customer(rs.getInt("customer.id"), rs.getString("customer.name")),
////                            new Customer(2, "name1"),
//                            rs.getInt("orders.amount"),
//                            rs.getDate("orders.timer")
//                    )
//            );
//        }
//        return list;
        return null;
    }
}
