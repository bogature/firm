package com.firm.demo.DAO.defect;

import com.firm.demo.DAO.defect.interfaces.IDefectDAO;
import com.firm.demo.datastorage.DataStorageJDBC;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Defect;
import com.firm.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DefectDAOJDBCImpl implements IDefectDAO {

    @Autowired
    DataStorageJDBC dataStorage;

    private List<Defect> list = new ArrayList<>();


    @Override
    public Defect insertDefect(Defect defect) {
        return null;
    }

    @Override
    public Defect getDefect(int id) {
        return null;
    }

    @Override
    public Defect updateDefect(Defect defect) throws SQLException {
        return null;
    }

    @Override
    public Defect deleteDefect(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Defect> getAll() throws SQLException {
//        list.clear();
//        ResultSet rs = dataStorage.executeQuery("select * from defect inner join product on product_id = product.id");
//        while(rs.next()){
//            list.add(new Defect(
//                            rs.getInt("id"),
//                            new Product(rs.getInt("product.id"), rs.getString("product.product_name"),null),
//                            rs.getDate("time")
//                    )
//            );
//        }
//        return list;
        return null;
    }
}
