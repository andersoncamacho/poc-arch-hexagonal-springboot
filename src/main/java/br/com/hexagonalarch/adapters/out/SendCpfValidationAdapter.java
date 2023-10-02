package br.com.hexagonalarch.adapters.out;

import br.com.hexagonalarch.application.ports.out.SendCpfForValidationOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutPutPort {

    @Autowired
    private KafkaTemplate<String, String> KafkaTemplate;

     @Override
     public void send(String cpf) {
         KafkaTemplate.send("topico-cpf-validation", cpf);
     }
}
