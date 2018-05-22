package com.firm.demo.service.customer;


import com.firm.demo.model.Customer;
import com.firm.demo.model.Product;
import com.firm.demo.reposetory.CustomerRepository;
import com.firm.demo.service.customer.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getCustomerByTypeAndDate(Date startTime,  Date finishTime , int type_id) {
        return customerRepository.getCustomerByTypeAndDate(startTime, finishTime, type_id);
    }

    @Override
    public List<Customer> getCustomerByTypeAndPrice(int product_id , int amount) {
        return customerRepository.getCustomerByTypeAndPrice(product_id, amount);
    }

}
