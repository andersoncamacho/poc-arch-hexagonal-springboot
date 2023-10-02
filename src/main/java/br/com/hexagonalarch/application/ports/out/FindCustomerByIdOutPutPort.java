package br.com.hexagonalarch.application.ports.out;

import br.com.hexagonalarch.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutPutPort {

    Optional<Customer> find(String id);

}
