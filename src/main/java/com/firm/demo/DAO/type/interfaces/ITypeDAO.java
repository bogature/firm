package com.firm.demo.DAO.type.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Type;

import java.sql.SQLException;
import java.util.List;

public interface ITypeDAO {

    Type insertType(Type type);

    Type getType(int id);

    Type updateType(Type type);

    Type deleteType(int id);

    List<Type> getAll() throws SQLException;

}
