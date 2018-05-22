package com.firm.demo.service.type;

import com.firm.demo.model.Type;
import com.firm.demo.reposetory.TypeRepository;
import com.firm.demo.service.type.interfaces.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TypeService implements ITypeService{

    @Autowired
    TypeRepository typeRepository;

    @Override
    public Type insertType(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public Type getType(int id) {
        return typeRepository.findById(id).get();
    }

    @Override
    public Type updateType(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public void deleteType(int id) {
        typeRepository.deleteById(id);
    }

    @Override
    public List<Type> getAll() throws SQLException {
        return typeRepository.findAll();
    }
}
