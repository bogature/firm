package com.firm.demo.DAO.center.interfaces;

import com.firm.demo.model.Center;
import com.firm.demo.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface ICenterDAO {

    public Center insertCountry(Center center);

    public Center getCountry(int id);

    public Center updateCountry(Center center) throws SQLException;

    public Center deleteCountry(int id) throws SQLException;

    public List<Center> getAll() throws SQLException;
}
