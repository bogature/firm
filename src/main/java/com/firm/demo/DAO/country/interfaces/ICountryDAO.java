package com.firm.demo.DAO.country.interfaces;

import com.firm.demo.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface ICountryDAO {

    public Country insertCountry(Country country);

    public Country getCountry(int id);

    public Country updateCountry(Country country) throws SQLException;

    public Country deleteCountry(int id) throws SQLException;

    public List<Country> getAll() throws SQLException;
}
