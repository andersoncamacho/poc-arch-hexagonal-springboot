package br.com.hexagonalarch.application.core.usecase;

import br.com.hexagonalarch.application.core.domain.Customer;
import br.com.hexagonalarch.application.ports.in.InsertCustomerInputPort;
import br.com.hexagonalarch.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexagonalarch.application.ports.out.InsertCustomerOutPutPort;
import br.com.hexagonalarch.application.ports.out.SendCpfForValidationOutPutPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutPutPort insertCustomerOutPutPort;

    private final SendCpfForValidationOutPutPort sendCpfForValidationOutPutPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutPutPort insertCustomerOutPutPort,
            SendCpfForValidationOutPutPort sendCpfForValidationOutPutPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutPutPort = insertCustomerOutPutPort;
        this.sendCpfForValidationOutPutPort = sendCpfForValidationOutPutPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutPutPort.insert(customer);
        sendCpfForValidationOutPutPort.send(customer.getCpf());
    }

}
