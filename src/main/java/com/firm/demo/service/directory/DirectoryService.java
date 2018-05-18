package com.firm.demo.service.directory;

import com.firm.demo.DAO.directory.DirectoryDAOJDBCImpl;
import com.firm.demo.DAO.product.ProductDAOJDBCImpl;
import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;
import com.firm.demo.reposetory.DirectoryRepository;
import com.firm.demo.service.directory.interfaces.IDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class DirectoryService implements IDirectoryService {

    @Autowired
    DirectoryRepository directoryRepository;

    @Override
    public Directory insertDirectory(Directory directory) {
        return directoryRepository.save(directory);
    }

    @Override
    public Directory getDirectory(int id) {
        return directoryRepository.findById(id).get();
    }

    @Override
    public Directory updateDirectory(Directory directory) {
        return directoryRepository.save(directory);
    }

    @Override
    public void deleteDirectory(int id) {
        directoryRepository.deleteById(id);
    }

    @Override
    public List<Directory> getAll() throws SQLException {
        return directoryRepository.findAll();
    }

}
