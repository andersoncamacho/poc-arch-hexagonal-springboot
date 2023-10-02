package br.com.hexagonalarch.application.ports.out;

import br.com.hexagonalarch.application.core.domain.Customer;

public interface InsertCustomerOutPutPort {

    void insert(Customer customer);

}
