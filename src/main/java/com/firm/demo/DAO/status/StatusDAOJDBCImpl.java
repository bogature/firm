package com.firm.demo.DAO.status;

import com.firm.demo.DAO.status.interfaces.IStatusDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Country;
import com.firm.demo.model.Product;
import com.firm.demo.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StatusDAOJDBCImpl implements IStatusDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    @Override
    public Status insertStatus(Status status) {
        return null;
    }

    @Override
    public Status getStatus(int id) {
        return null;
    }

    @Override
    public Status updateStatus(Status status) {
        return null;
    }

    @Override
    public Status deleteStatus(int id) {
        return null;
    }

    @Override
    public List<Status> getAll() throws SQLException {
//        List<Status> list = new ArrayList<>();
//        ResultSet rs = dataStorage.executeQuery("select * from status");
//
//        while(rs.next()){
//            list.add(new Status(rs.getInt("id"),
//                    rs.getString("name")
//                    )
//            );
//        }
//
//        return list;
        return null;
    }
}
