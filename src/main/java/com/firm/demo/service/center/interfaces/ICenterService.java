package com.firm.demo.service.center.interfaces;

import com.firm.demo.model.Center;
import com.firm.demo.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface ICenterService {

    Center insertCenter(Center center);

    Center getCenter(int id);

    Center updateCenter(Center center);

    void deleteCenter(int id);

    List<Center> getAll() throws SQLException;

}
