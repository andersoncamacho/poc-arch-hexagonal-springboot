package br.com.hexagonalarch.adapters.out;

import br.com.hexagonalarch.adapters.out.repository.CustomerRepository;
import br.com.hexagonalarch.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexagonalarch.application.core.domain.Customer;
import br.com.hexagonalarch.application.ports.out.InsertCustomerOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
