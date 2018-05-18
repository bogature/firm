package com.firm.demo.controller;

import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.model.Type;
import com.firm.demo.service.provider.ProviderService;
import com.firm.demo.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/provider")
    public List<Provider> showProvider() throws SQLException {
        return providerService.getAll();
    }

    @PostMapping("provider/insert")
    public Provider insertStreet(@RequestBody Provider provider) {
        return providerService.insertProvider(provider);
    }

    @RequestMapping("/provider/del")
    public void delStreet(@RequestParam("id") int id){
        providerService.deleteProvider(id);
    }

    @RequestMapping("/provider/update")
    public Provider update(@RequestBody Provider provider,@RequestParam("id") int id) {
        provider.setId(id);
        return providerService.updateProvider(provider);
    }

    @GetMapping("/provider/get")
    Provider getGroupById(@RequestParam("id") int id) {
        return providerService.getProvider(id);
    }

    @RequestMapping("/provider/getProvidersByCategoryAndType")
    public List<Provider> getProvidersByCategoryAndType(@RequestParam("id") int id){
        return providerService.getProvidersByCategoryAndType(id);
    }
}
