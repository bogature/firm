package com.firm.demo.DAO.customer.interfaces;

import com.firm.demo.model.Customer;
import com.firm.demo.model.Directory;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {

    public Customer insertCustomer(Customer customer);

    public Customer getCustomer(int id);

    public Customer updateCustomer(Customer customer) throws SQLException;

    public Customer deleteCustomer(int id) throws SQLException;

    public List<Customer> getAll() throws SQLException;
}
