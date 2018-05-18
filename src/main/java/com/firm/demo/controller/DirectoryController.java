package com.firm.demo.controller;

import com.firm.demo.model.Directory;
import com.firm.demo.service.directory.DirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DirectoryController {

    @Autowired
    DirectoryService directoryService;

    @GetMapping("/directory")
    public List<Directory> showDirectory() throws SQLException {
        return directoryService.getAll();
    }
    @RequestMapping("/directory/del")
    public void delCountry(@RequestParam("id") int id){
        directoryService.deleteDirectory(id);
    }

    @PostMapping("/directory/insert")
    public Directory insertStreet(@RequestBody Directory directory) {
        return directoryService.insertDirectory(directory);
    }

    @RequestMapping("/directory/update")
    public Directory update(@RequestBody Directory directory, @RequestParam("id") int id) {
        directory.setId(id);
        return directoryService.updateDirectory(directory);
    }

    @GetMapping("/directory/get")
    Directory getGroupById(@RequestParam("id") int id) {
        return directoryService.getDirectory(id);
    }


}
