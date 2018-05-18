package com.firm.demo.controller;

import com.firm.demo.model.Category;
import com.firm.demo.model.Center;
import com.firm.demo.service.center.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CenterController {

    @Autowired
    CenterService centerService;

    @GetMapping("/center")
    public List<Center> showCenter() throws SQLException {
        return centerService.getAll();
    }

    @PostMapping("/center/insert")
    public Center insertCategory(@RequestBody Center center) {
        return centerService.insertCenter(center);
    }

    @RequestMapping("/center/del")
    public void delCategory(@RequestParam("id") int id){
        centerService.deleteCenter(id);
    }

    @RequestMapping("/center/update")
    public Center updateCategory(@RequestBody Center center, @RequestParam("id") int id) {
        center.setId(id);
        return centerService.updateCenter(center);
    }

    @GetMapping("/center/get")
    Center getGroupById(@RequestParam("id") int id) {
        return centerService.getCenter(id);
    }

}
