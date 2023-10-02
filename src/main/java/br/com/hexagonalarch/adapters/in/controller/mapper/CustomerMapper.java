package br.com.hexagonalarch.adapters.in.controller.mapper;

import br.com.hexagonalarch.adapters.in.controller.Request.CustomerRequest;
import br.com.hexagonalarch.adapters.in.controller.response.CustomerResponse;
import br.com.hexagonalarch.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
