package com.firm.demo.controller;


import com.firm.demo.model.Center;
import com.firm.demo.model.Country;
import com.firm.demo.service.country.CountryService;
import com.firm.demo.service.country.interfaces.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    public List<Country> showChairs() throws SQLException {
        return countryService.getAll();
    }

    @PostMapping("/country/insert")
    public Country insertOneChair(@RequestBody Country country) {
        return countryService.insertCountry(country);
    }

    @RequestMapping("/country/del")
    public void delCountry(@RequestParam("id") int id){
        countryService.deleteCountry(id);
    }

    @RequestMapping("/country/update")
    public Country updateRegion(@RequestBody Country country, @RequestParam("id") int id) {
        country.setId(id);
        return countryService.updateCountry(country);
    }

    @GetMapping("/country/get")
    Country get(@RequestParam("id") int id) {
        return countryService.getCountry(id);
    }

}
