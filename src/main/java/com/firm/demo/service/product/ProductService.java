package com.firm.demo.service.product;

import com.firm.demo.DAO.country.CountryDAOJDBCImpl;
import com.firm.demo.DAO.product.ProductDAOJDBCImpl;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.reposetory.ProductRepository;
import com.firm.demo.service.product.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAll() throws SQLException {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public List<Product> getProductByDay(Date time) {
        return productRepository.getProductByDay(time);
    }


    @Override
    public int getCountProductByDay(Date time) {
        return productRepository.getCountProductByDay(time);
    }

    @Override
    public float getPriceProductByDay(Date time) {
        return productRepository.getPriceProductByDay(time);
    }

    @Override
    public int getCountProductNoByStatus(int status) {
        return productRepository.getCountProductNoByStatus(status);
    }


}
