package br.com.hexagonalarch.adapters.out.client.mapper;

import br.com.hexagonalarch.adapters.out.client.response.AddressResponse;
import br.com.hexagonalarch.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
