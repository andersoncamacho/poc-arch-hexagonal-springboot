package br.com.hexagonalarch.application.ports.out;

import br.com.hexagonalarch.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
