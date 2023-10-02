package br.com.hexagonalarch.application.core.usecase;

import br.com.hexagonalarch.application.core.domain.Customer;
import br.com.hexagonalarch.application.ports.in.FindCustomerByIdInputPort;
import br.com.hexagonalarch.application.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort) {
        this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
    }


    @Override
    public Customer find(String id) {
         return  findCustomerByIdOutPutPort.find(id)
                 .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
