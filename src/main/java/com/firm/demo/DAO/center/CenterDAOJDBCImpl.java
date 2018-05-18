package com.firm.demo.DAO.center;

import com.firm.demo.DAO.center.interfaces.ICenterDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Center;
import com.firm.demo.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CenterDAOJDBCImpl implements ICenterDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Center> list = new ArrayList<>();


    @Override
    public Center insertCountry(Center center) {
        return null;
    }

    @Override
    public Center getCountry(int id) {
        return null;
    }

    @Override
    public Center updateCountry(Center center) throws SQLException {
        return null;
    }

    @Override
    public Center deleteCountry(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Center> getAll() throws SQLException {
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("SELECT * FROM center");
//        while(rs.next()){
//            list.add(new Center(
//                            rs.getInt("id"),
//                            rs.getString("center_name")
//                    )
//            );
//        }
//        return list;
        return null;
    }
}
