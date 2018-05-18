package com.firm.demo.service.status.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Status;
import com.firm.demo.model.Type;

import java.sql.SQLException;
import java.util.List;

public interface IStatusService {

    Status insertStatus(Status status);

    Status getStatus(int id);

    Status updateStatus(Status status);

    void deleteStatus(int id);

    List<Status> getAll() throws SQLException;

}
