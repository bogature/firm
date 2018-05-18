package com.firm.demo.DAO.type;

import com.firm.demo.DAO.product.interfaces.IProductDAO;
import com.firm.demo.DAO.type.interfaces.ITypeDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Country;
import com.firm.demo.model.Product;
import com.firm.demo.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TypeDAOJDBCImpl implements ITypeDAO {

    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public Type insertType(Type type) {
        return null;
    }

    @Override
    public Type getType(int id) {
        return null;
    }

    @Override
    public Type updateType(Type type) {
        return null;
    }

    @Override
    public Type deleteType(int id) {
        return null;
    }

    @Override
    public List<Type> getAll() throws SQLException {
        return null;
//        List<Type> list = new ArrayList<>();
//        ResultSet rs = dataStorage.executeQuery("select * from type");
//
//        while(rs.next()){
//            list.add(new Type(rs.getInt("id"), rs.getString("name")));
//        }
//
//        return list;
    }
}
