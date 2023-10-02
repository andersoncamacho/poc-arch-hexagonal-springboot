package br.com.hexagonalarch.application.ports.out;

import br.com.hexagonalarch.application.core.domain.Customer;

public interface UpdateCustomerOutPutPort {

    void update(Customer customer);

}
