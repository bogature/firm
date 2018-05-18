package com.firm.demo.DAO.provider;

import com.firm.demo.DAO.provider.interfaces.IProviderDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Category;
import com.firm.demo.model.Country;
import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProviderDAOJDBCImpl implements IProviderDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    @Override
    public Provider insertProvider(Provider provider) {
        return null;
    }

    @Override
    public Provider getProvider(int id) {
        return null;
    }

    @Override
    public Provider updateProvider(Provider provider) {
        return null;
    }

    @Override
    public Provider deleteProvider(int id) {
        return null;
    }

    @Override
    public List<Provider> getAll() throws SQLException {
//        List<Provider> list = new ArrayList<>();
//        ResultSet rs = dataStorage.executeQuery("select * from provider inner join category on category_id = category.id");
//
//        while(rs.next()){
//            list.add(new Provider(
//                    rs.getInt("provider.id"),
//                    rs.getString("provider.name"),
//                    new Category (rs.getInt("category.id"),rs.getString("category.name"))
//                    )
//            );
//        }
//
//        return list;
        return null;
    }
}
