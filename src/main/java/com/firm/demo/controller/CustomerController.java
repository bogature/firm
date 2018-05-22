package com.firm.demo.controller;

import com.firm.demo.model.Category;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Order;
import com.firm.demo.model.Product;
import com.firm.demo.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> showCustomer() throws SQLException {
        return customerService.getAll();
    }

    @PostMapping("/customer/insert")
    public Customer insertCategory(@RequestBody Customer customer) {
        return customerService.insertCustomer(customer);
    }

    @RequestMapping("/customer/del")
    public void delCategory(@RequestParam("id") int id){
        customerService.deleteCustomer(id);
    }

    @RequestMapping("/customer/update")
    public Customer updateCategory(@RequestBody Customer customer, @RequestParam("id") int id) {
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/customer/get")
    Customer getGroupById(@RequestParam("id") int id) {
        return customerService.getCustomer(id);
    }


    @RequestMapping("/customer/getCustomerByTypeAndDate")
    public List<Customer> getCustomerByTypeAndDate(@RequestParam("startTime") Date startTime , @RequestParam("finishTime") Date finishTime , @RequestParam("type_id") int type_id ){
        return customerService.getCustomerByTypeAndDate(startTime, finishTime, type_id);
    }

    @RequestMapping("/customer/getCustomerByTypeAndPrice")
    public List<Customer> getCustomerByTypeAndPrice(@RequestParam("product_id") int product_id , @RequestParam("amount") int amount ){
        return customerService.getCustomerByTypeAndPrice(product_id, amount);
    }


}
