package com.firm.demo.service.provider;

import com.firm.demo.model.Provider;
import com.firm.demo.reposetory.ProviderRepository;
import com.firm.demo.service.provider.interfaces.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@Service
public class ProviderService implements IProviderService {

    @Autowired
    ProviderRepository providerRepository;

    @Override
    public Provider insertProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public Provider getProvider(int id) {
        return providerRepository.findById(id).get();
    }

    @Override
    public Provider updateProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public void deleteProvider(int id) {
        providerRepository.deleteById(id);
    }

    @Override
    public List<Provider> getAll() throws SQLException {
        return providerRepository.findAll();
    }

    @Override
    public List<Provider> getProvidersByCategoryAndType(int categorys_id, int type_id) {
        return providerRepository.getProvidersByCategoryAndType(categorys_id, type_id);
    }

    @Override
    public List<Provider> getProvidersByTimerAndCount(int id, Date timer, int amount, Date timerFinish) {
        return providerRepository.getProvidersByTimerAndCount(id, timer, amount, timerFinish);
    }

    @Override
    public List<Provider> getProvidersByDefect(int id) {
        return providerRepository.getProvidersByDefect(id);
    }

    @Override
    public float getCountProviderByProcent(int provider_id) {
        return providerRepository.getCountProviderByProcent(provider_id);
    }

    @Override
    public float getCountProviderByPrice(int provider_id) {
        return providerRepository.getCountProviderByPrice(provider_id);
    }

    @Override
    public int getCountAllProduct() {
        return providerRepository.getCountAllProduct();
    }
}
