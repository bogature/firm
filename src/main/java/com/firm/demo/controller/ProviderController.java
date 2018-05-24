package com.firm.demo.controller;

import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.model.Type;
import com.firm.demo.service.provider.ProviderService;
import com.firm.demo.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
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
    public List<Provider> getProvidersByCategoryAndType(@RequestParam("categorys_id") int id, @RequestParam("type_id") int type_id){
        return providerService.getProvidersByCategoryAndType(id, type_id);
    }

    @RequestMapping("/provider/getProvidersByTimerAndCount")
    public List<Provider> getProvidersByTimerAndCount(@RequestParam("product_id") int product_id, @RequestParam("timerStart") Date timerStart, @RequestParam("timerFinish") Date timerFinish, @RequestParam("amount") int amount){
        return providerService.getProvidersByTimerAndCount(product_id, timerStart, timerFinish, amount);
    }

    @RequestMapping("/provider/getProvidersByDefect")
    public List<Provider> getProvidersByDefect(@RequestParam("product_id") int product_id){
        return providerService.getProvidersByDefect(product_id);
    }

    @RequestMapping("/provider/getCountProviderByProcent")
    public float getCountProviderByProcent(@RequestParam("provider_id") int provider_id){
        return providerService.getCountProviderByProcent(provider_id);
    }

    @RequestMapping("/provider/getCountProviderByPrice")
    public float getCountProviderByPrice(@RequestParam("provider_id") int provider_id){
        return providerService.getCountProviderByPrice(provider_id);
    }

    @RequestMapping("/provider/getCountAllProduct")
    public int getCountAllProduct(){
        return providerService.getCountAllProduct();
    }


}
