package com.firm.demo.DAO.product.interfaces;

import com.firm.demo.model.Country;
import com.firm.demo.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {

    Product insertProduct(Product product);

    Product getProduct(int id);

    Product updateProduct(Product product);

    Product deleteProduct(int id);

    List<Product> getAll() throws SQLException;

    Product bestProduct();
}
