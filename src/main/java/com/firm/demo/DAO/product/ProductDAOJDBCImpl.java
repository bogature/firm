package com.firm.demo.DAO.product;

import com.firm.demo.DAO.product.interfaces.IProductDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDAOJDBCImpl implements IProductDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    @Override
    public Product insertProduct(Product product) {
        return null;
    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() throws SQLException {
//
//        List<Product> list = new ArrayList<>();
//        ResultSet rs = dataStorage.executeQuery("select * from product inner join country on product.country_id = country.id " +
//                "inner join provider on product.provider_id = provider.id inner join status on product.status_id = status.id" +
//                " inner join type on product.type_id = type.id inner join center on product.center_id = center.id;");
//
//        while(rs.next()){
//            list.add(new Product(rs.getInt("product.id"),
//                    rs.getString("product.product_name"),
//                    new Country(rs.getInt("country.id"),rs.getString("countrycol")),
//                    rs.getFloat("product.price"),
//                    new Center(rs.getInt("center.id"),rs.getString("center.center_name")),
//                    new Provider(rs.getInt("provider.id"),rs.getString("provider.name"),null),
//                    new Type(rs.getInt("type.id"),rs.getString("type.name")),
//                    new Status(rs.getInt("status.id"),rs.getString("status.name")),
//                    rs.getDate("product.timer"))
//            );
//        }

//        return list;
        return null;
    }

    @Override
    public Product bestProduct() {
        return null;
    }
}
