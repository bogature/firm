package com.firm.demo.DAO.status.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Status;

import java.sql.SQLException;
import java.util.List;

public interface IStatusDAO {

    Status insertStatus(Status status);

    Status getStatus(int id);

    Status updateStatus(Status status);

    Status deleteStatus(int id);

    List<Status> getAll() throws SQLException;

}
