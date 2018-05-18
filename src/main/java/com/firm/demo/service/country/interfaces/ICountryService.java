package com.firm.demo.service.country.interfaces;

import com.firm.demo.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface ICountryService {

    Country insertCountry(Country country);

    Country getCountry(int id);

    Country updateCountry(Country country);

    void deleteCountry(int id);

    List<Country> getAll() throws SQLException;

}
