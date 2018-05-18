package com.firm.demo.controller;

import com.firm.demo.model.Center;
import com.firm.demo.model.Country;
import com.firm.demo.model.Customer;
import com.firm.demo.model.Defect;
import com.firm.demo.service.center.CenterService;
import com.firm.demo.service.defect.DefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DefectController {

    @Autowired
    DefectService defectService;

    @GetMapping("/defect")
    public List<Defect> showDefect() throws SQLException {
        return defectService.getAll();
    }

    @RequestMapping("/defect/del")
    public void delCountry(@RequestParam("id") int id){
        defectService.deleteDefect(id);
    }

    @PostMapping("/defect/insert")
    public Defect insert(@RequestBody Defect defect) {
        return defectService.insertDefect(defect);
    }

    @RequestMapping("/defect/update")
    public Defect updateRegion(@RequestBody Defect defect, @RequestParam("id") int id) {
        defect.setId(id);
        return defectService.updateDefect(defect);
    }

    @GetMapping("/defect/get")
    Defect get(@RequestParam("id") int id) {
        return defectService.getDefect(id);
    }

}
