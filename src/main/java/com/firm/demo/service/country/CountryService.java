package com.firm.demo.service.country;

import com.firm.demo.model.Country;
import com.firm.demo.reposetory.CountryRepository;
import com.firm.demo.service.country.interfaces.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country insertCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country getCountry(int id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }

    @Override
    public List<Country> getAll() throws SQLException {
        return countryRepository.findAll();
    }

}
