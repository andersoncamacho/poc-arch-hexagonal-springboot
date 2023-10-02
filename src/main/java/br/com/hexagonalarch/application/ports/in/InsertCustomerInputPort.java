package br.com.hexagonalarch.application.ports.in;

import br.com.hexagonalarch.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
