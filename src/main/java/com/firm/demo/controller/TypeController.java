package com.firm.demo.controller;

import com.firm.demo.model.Country;
import com.firm.demo.model.Product;
import com.firm.demo.model.Status;
import com.firm.demo.model.Type;
import com.firm.demo.service.product.ProductService;
import com.firm.demo.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping("/type")
    public List<Type> showType() throws SQLException {
        return typeService.getAll();
    }

    @PostMapping("/type/insert")
    public Type insertOneChair(@RequestBody Type type) {
        return typeService.insertType(type);
    }

    @RequestMapping("/type/del")
    public void delCountry(@RequestParam("id") int id){
        typeService.deleteType(id);
    }

    @RequestMapping("/type/update")
    public Type updateRegion(@RequestBody Type type, @RequestParam("id") int id) {
        type.setId(id);
        return typeService.updateType(type);
    }

    @GetMapping("/type/get")
    Type get(@RequestParam("id") int id) {
        return typeService.getType(id);
    }

}
