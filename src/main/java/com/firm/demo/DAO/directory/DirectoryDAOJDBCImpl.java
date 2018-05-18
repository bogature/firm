package com.firm.demo.DAO.directory;

import com.firm.demo.DAO.country.interfaces.ICountryDAO;
import com.firm.demo.DAO.directory.interfaces.IDirectoryDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Country;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DirectoryDAOJDBCImpl implements IDirectoryDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Directory> list = new ArrayList<>();

    @Override
    public Directory insertCountry(Directory directory) {
        return null;
    }

    @Override
    public Directory getCountry(int id) {
        return null;
    }

    @Override
    public Directory updateCountry(Directory directory) throws SQLException {
        return null;
    }

    @Override
    public Directory deleteCountry(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Directory> getAll() throws SQLException {
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("select * from directory inner join product on product_id = product.id ");
//        while(rs.next()){
//            list.add(new Directory(
//                    rs.getInt("id"),
//                    new Product(rs.getInt("product.id"), rs.getString("product.product_name"), null)
//                    )
//            );
//        }
//        return list;
        return null;
    }

}
