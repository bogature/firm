package com.firm.demo.controller;

import com.firm.demo.model.Defect;
import com.firm.demo.model.Status;
import com.firm.demo.model.Type;
import com.firm.demo.service.status.StatusService;
import com.firm.demo.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StatusController {

    @Autowired
    StatusService statusService;

    @GetMapping("/status")
    public List<Status> showStatus() throws SQLException {
        return statusService.getAll();
    }

    @PostMapping("/status/insert")
    public Status insertOneChair(@RequestBody Status status) {
        return statusService.insertStatus(status);
    }

    @RequestMapping("/status/del")
    public void delCountry(@RequestParam("id") int id){
        statusService.deleteStatus(id);
    }

    @RequestMapping("/status/update")
    public Status updateRegion(@RequestBody Status status, @RequestParam("id") int id) {
        status.setId(id);
        return statusService.updateStatus(status);
    }

    @GetMapping("/status/get")
    Status getGroupById(@RequestParam("id") int id) {
        return statusService.getStatus(id);
    }

}
