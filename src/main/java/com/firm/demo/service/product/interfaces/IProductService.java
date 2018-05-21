package com.firm.demo.service.product.interfaces;

import com.firm.demo.model.Country;
import com.firm.demo.model.Product;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    Product insertProduct(Product product);

    Product getProduct(int id);

    Product updateProduct(Product product);

    void deleteProduct(int id);

    List<Product> getAll() throws SQLException;

    List<Product> getProductByDay(Date time);

    int getCountProductByDay(Date time);

    float getPriceProductByDay(Date time);

    int getCountProductNoByStatus(int status);

}
