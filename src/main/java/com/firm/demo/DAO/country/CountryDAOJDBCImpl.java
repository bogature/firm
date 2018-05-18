package com.firm.demo.DAO.country;

import com.firm.demo.DAO.country.interfaces.ICountryDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryDAOJDBCImpl implements ICountryDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Country> list = new ArrayList<>();

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
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("SELECT * FROM country");
//        while(rs.next()){
//            list.add(new Country(
//                            rs.getInt("id"),
//                            rs.getString("countrycol")
//                    )
//            );
//        }
//        return list;
        return null;

    }

}
