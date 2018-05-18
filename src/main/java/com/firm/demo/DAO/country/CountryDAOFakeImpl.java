package com.firm.demo.DAO.country;

import com.firm.demo.DAO.country.interfaces.ICountryDAO;
import com.firm.demo.model.Country;

import java.sql.SQLException;
import java.util.List;

public class CountryDAOFakeImpl implements ICountryDAO {

    @Override
    public Country insertCountry(Country country) {
        return null;
    }

    @Override
    public Country getCountry(int id) {
        return null;
    }

    @Override
    public Country updateCountry(Country country) throws SQLException {
        return null;
    }

    @Override
    public Country deleteCountry(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Country> getAll() throws SQLException {
        return null;
    }

}
