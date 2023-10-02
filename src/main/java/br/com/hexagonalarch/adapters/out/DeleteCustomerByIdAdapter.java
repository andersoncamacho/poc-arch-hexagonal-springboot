package br.com.hexagonalarch.adapters.out;

import br.com.hexagonalarch.adapters.out.repository.CustomerRepository;
import br.com.hexagonalarch.application.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
      customerRepository.deleteById(id);
    }
}
