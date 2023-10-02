package br.com.hexagonalarch.adapters.in.consumer;

import br.com.hexagonalarch.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.hexagonalarch.adapters.in.consumer.message.CustomerMessage;
import br.com.hexagonalarch.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "topico-cpf-validated", groupId = "hexagonal")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
