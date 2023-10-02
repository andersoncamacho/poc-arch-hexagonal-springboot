package br.com.hexagonalarch.adapters.out.repository.mapper;

import br.com.hexagonalarch.adapters.out.repository.entity.CustomerEntity;
import br.com.hexagonalarch.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
