package com.firm.demo.service.type.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Type;

import java.sql.SQLException;
import java.util.List;

public interface ITypeService {
    Type insertType(Type type);

    Type getType(int id);

    Type updateType(Type type);

    void deleteType(int id);

    List<Type> getAll() throws SQLException;

}
