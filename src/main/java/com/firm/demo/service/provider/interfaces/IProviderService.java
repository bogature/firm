package com.firm.demo.service.provider.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;
import com.firm.demo.model.Type;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface IProviderService {

    Provider insertProvider(Provider provider);

    Provider getProvider(int id);

    Provider updateProvider(Provider provider);

    void deleteProvider(int id);

    List<Provider> getAll() throws SQLException;

    List<Provider> getProvidersByCategoryAndType(int id, int type_id);

    List<Provider> getProvidersByTimerAndCount(int id, Date timerStart, int amount, Date timerFinish);

    List<Provider> getProvidersByDefect(int id);

}
