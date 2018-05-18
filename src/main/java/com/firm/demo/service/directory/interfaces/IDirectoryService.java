package com.firm.demo.service.directory.interfaces;

import com.firm.demo.model.Directory;
import com.firm.demo.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IDirectoryService {

    Directory insertDirectory(Directory directory);

    Directory getDirectory(int id);

    Directory updateDirectory(Directory directory);

    void deleteDirectory(int id);

    List<Directory> getAll() throws SQLException;

}
