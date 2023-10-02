package br.com.hexagonalarch.adapters.out;

import br.com.hexagonalarch.adapters.out.repository.CustomerRepository;
import br.com.hexagonalarch.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexagonalarch.application.core.domain.Customer;
import br.com.hexagonalarch.application.ports.out.UpdateCustomerOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
       var customerEntity = customerEntityMapper.toCustomerEntity(customer);
       customerRepository.save(customerEntity);
    }
}
