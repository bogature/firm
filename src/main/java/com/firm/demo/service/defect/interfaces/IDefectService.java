package com.firm.demo.service.defect.interfaces;

import com.firm.demo.model.Customer;
import com.firm.demo.model.Defect;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface IDefectService {

    Defect insertDefect(Defect defect);

    Defect getDefect(int id);

    Defect updateDefect(Defect defect);

    void deleteDefect(int id);

    List<Defect> getAll() throws SQLException;

    int getCountDefectByDay(Date startTime, Date finishTime);

    List<Defect> getDefectByDate(Date startTime, Date finishTime);

}
