package br.com.hexagonalarch.application.ports.in;

import br.com.hexagonalarch.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
