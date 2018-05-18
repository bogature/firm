package com.firm.demo.DAO.provider.interfaces;

import com.firm.demo.model.Product;
import com.firm.demo.model.Provider;

import java.sql.SQLException;
import java.util.List;

public interface IProviderDAO {

    Provider insertProvider(Provider provider);

    Provider getProvider(int id);

    Provider updateProvider(Provider provider);

    Provider deleteProvider(int id);

    List<Provider> getAll() throws SQLException;

}
