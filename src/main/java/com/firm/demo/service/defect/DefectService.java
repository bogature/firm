package com.firm.demo.service.defect;

import com.firm.demo.DAO.customer.CustomerDAOJDBCImpl;
import com.firm.demo.DAO.defect.DefectDAOJDBCImpl;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Defect;
import com.firm.demo.model.Product;
import com.firm.demo.reposetory.DefectRepository;
import com.firm.demo.service.defect.interfaces.IDefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@Service
public class DefectService implements IDefectService {

    @Autowired
    DefectRepository defectRepository;


    @Override
    public Defect insertDefect(Defect defect) {
        return defectRepository.save(defect);
    }

    @Override
    public Defect getDefect(int id) {
        return  defectRepository.findById(id).get();
    }

    @Override
    public Defect updateDefect(Defect defect) {
        return defectRepository.save(defect);
    }

    @Override
    public void deleteDefect(int id) {
        defectRepository.deleteById(id);
    }

    @Override
    public List<Defect> getAll() throws SQLException {
        return defectRepository.findAll();
    }

    @Override
    public int getCountDefectByDay(Date startTime, Date finishTime) {
        return defectRepository.getCountDefectByDay(startTime, finishTime);
    }

    @Override
    public List<Defect> getDefectByDate(Date startTime, Date finishTime) {
        return defectRepository.getDefectByDate(startTime, finishTime);
    }

}
