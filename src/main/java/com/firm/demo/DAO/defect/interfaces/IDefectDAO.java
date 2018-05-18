package com.firm.demo.DAO.defect.interfaces;

import com.firm.demo.model.Customer;
import com.firm.demo.model.Defect;

import java.sql.SQLException;
import java.util.List;

public interface IDefectDAO {

    public Defect insertDefect(Defect defect);

    public Defect getDefect(int id);

    public Defect updateDefect(Defect defect) throws SQLException;

    public Defect deleteDefect(int id) throws SQLException;

    public List<Defect> getAll() throws SQLException;

}
