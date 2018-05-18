package com.firm.demo.service.center;

import com.firm.demo.DAO.center.CenterDAOJDBCImpl;
import com.firm.demo.DAO.country.CountryDAOJDBCImpl;
import com.firm.demo.model.Center;
import com.firm.demo.model.Country;
import com.firm.demo.reposetory.CenterRepository;
import com.firm.demo.service.center.interfaces.ICenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CenterService implements ICenterService {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public Center insertCenter(Center center) {
        return centerRepository.save(center);
    }

    @Override
    public Center getCenter(int id) {
        return centerRepository.findById(id).get();
    }

    @Override
    public Center updateCenter(Center center) {
        return centerRepository.save(center);
    }

    @Override
    public void deleteCenter(int id) {
        centerRepository.deleteById(id);
    }

    @Override
    public List<Center> getAll() throws SQLException {
        return centerRepository.findAll();
    }
}
