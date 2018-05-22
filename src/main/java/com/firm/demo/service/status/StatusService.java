package com.firm.demo.service.status;

import com.firm.demo.model.Status;
import com.firm.demo.reposetory.StatusRepository;
import com.firm.demo.service.status.interfaces.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class StatusService implements IStatusService{

    @Autowired
    StatusRepository statusRepository;

    @Override
    public Status insertStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status getStatus(int id) {
        return statusRepository.findById(id).get();
    }

    @Override
    public Status updateStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void deleteStatus(int id) {
        statusRepository.deleteById(id);
    }

    @Override
    public List<Status> getAll() throws SQLException {
        return statusRepository.findAll();
    }

}
