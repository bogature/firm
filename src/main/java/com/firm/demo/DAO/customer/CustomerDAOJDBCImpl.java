package com.firm.demo.DAO.customer;

import com.firm.demo.DAO.customer.interfaces.ICustomerDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Country;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerDAOJDBCImpl implements ICustomerDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Customer> list = new ArrayList<>();


    @Override
    public Customer insertCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) throws SQLException {
        return null;
    }

    @Override
    public Customer deleteCustomer(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> getAll() throws SQLException {
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("SELECT * FROM customer");
//        while(rs.next()){
//            list.add(new Customer(
//                            rs.getInt("id"),
//                            rs.getString("name")
//                    )
//            );
//        }
//        return list;
        return null;
    }
}
