package com.firm.demo.controller;


import com.firm.demo.model.Country;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.service.country.CountryService;
import com.firm.demo.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public List<Product> showProducts() throws SQLException {
        return productService.getAll();
    }

    @PostMapping("/product/insert")
    public Product insertStreet(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @RequestMapping("/product/update")
    public Product update(@RequestBody Product product,@RequestParam("id") int id) {
        product.setId(id);
        return productService.updateProduct(product);
    }

    @RequestMapping("/product/del")
    public void delCountry(@RequestParam("id") int id){
        productService.deleteProduct(id);
    }

    @GetMapping("/product/get")
    Product getGroupById(@RequestParam("id") int id) {
        return  productService.getProduct(id);
    }

    @RequestMapping("/product/getProductByDay")
    public List<Product> getProductByDay(@RequestParam("time") Date time ){
        return productService.getProductByDay(time);
    }

    @RequestMapping("/product/getCountProductByDay")
    public int getCountProductByDay(@RequestParam("time") Date time ){
        return productService.getCountProductByDay(time);
    }

    @RequestMapping("/product/getPriceProductByDay")
    public float getPriceProductByDay(@RequestParam("time") Date time ){
        return productService.getPriceProductByDay(time);
    }

    @RequestMapping("/product/getCountProductNoByStatus")
    public int getCountProductNoByStatus(@RequestParam("status_id") int status ){
        return productService.getCountProductNoByStatus(status);
    }


}
