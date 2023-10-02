package br.com.hexagonalarch.application.core.usecase;

import br.com.hexagonalarch.application.core.domain.Customer;
import br.com.hexagonalarch.application.ports.in.FindCustomerByIdInputPort;
import br.com.hexagonalarch.application.ports.in.UpdateCustomerInputPort;
import br.com.hexagonalarch.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexagonalarch.application.ports.out.UpdateCustomerOutPutPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutPutPort updateCustomerOutPutPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutPutPort updateCustomerOutPutPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutPutPort = updateCustomerOutPutPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
         findCustomerByIdInputPort.find(customer.getId());
         var address = findAddressByZipCodeOutputPort.find(zipCode);
         customer.setAddress(address);
         updateCustomerOutPutPort.update(customer);
    }
}
