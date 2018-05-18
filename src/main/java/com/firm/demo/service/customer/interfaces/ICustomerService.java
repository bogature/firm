package com.firm.demo.service.customer.interfaces;

import com.firm.demo.model.Customer;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;

import java.sql.SQLException;
import java.util.Currency;
import java.util.List;

public interface ICustomerService {

    Customer insertCustomer(Customer customer);

    Customer getCustomer(int id);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(int id);

    List<Customer> getAll() throws SQLException;

}
