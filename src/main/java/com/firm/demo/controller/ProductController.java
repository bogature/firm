package com.firm.demo.controller;


import com.firm.demo.model.Country;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.service.country.CountryService;
import com.firm.demo.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    @RequestMapping("/product/getProductByTypeAndProviderAndPrice")
    public List<Product> getProductByTypeAndProviderAndPrice(@RequestParam("type_id") int type_id , @RequestParam("provider_id") int provider_id, @RequestParam("price") float price ){
        return productService.getProductByTypeAndProviderAndPrice(type_id, provider_id, price);
    }

    @RequestMapping("/product/getProductByTypeAndStatus")
    public List<Product> getProductByTypeAndStatus(@RequestParam("type_id") int type_id , @RequestParam("status_id") int status_id){
        return productService.getProductByTypeAndStatus(type_id, status_id);
    }

    @RequestMapping("/product/getCountProductByTypeAndStatus")
    public int getCountProductByTypeAndStatus(@RequestParam("status_id") int status_id, @RequestParam("type_id") int type_id){
        return productService.getCountProductByTypeAndStatus(status_id, type_id);
    }

    @RequestMapping("/product/getProductByFamous")
    public List<Product> getProductByFamous(){
        return productService.getProductByFamous();
    }

    @RequestMapping("/product/getProductByCheap")
    public List<Product> getProductByCheap(){
        return productService.getProductByCheap();
    }

    @RequestMapping("/product/getProductByCountryAndCenter")
    public List<Product> getProductByCountryAndCenter(@RequestParam("country_id") int country_id, @RequestParam("center_id") int center_id){
        return productService.getProductByCountryAndCenter(country_id,center_id);
    }


}
