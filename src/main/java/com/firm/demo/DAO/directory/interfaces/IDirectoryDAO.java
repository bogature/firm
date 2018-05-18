package com.firm.demo.DAO.directory.interfaces;

import com.firm.demo.model.Country;
import com.firm.demo.model.Directory;

import java.sql.SQLException;
import java.util.List;

public interface IDirectoryDAO {

    public Directory insertCountry(Directory directory);

    public Directory getCountry(int id);

    public Directory updateCountry(Directory directory) throws SQLException;

    public Directory deleteCountry(int id) throws SQLException;

    public List<Directory> getAll() throws SQLException;
}
