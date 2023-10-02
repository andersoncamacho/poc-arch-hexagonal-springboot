package br.com.hexagonalarch.config;

import br.com.hexagonalarch.adapters.out.FindAddressByZipCodeAdapter;
import br.com.hexagonalarch.adapters.out.InsertCustomerAdapter;
import br.com.hexagonalarch.adapters.out.SendCpfValidationAdapter;
import br.com.hexagonalarch.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter SendCpfValidationAdapter
    ){
        return  new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, SendCpfValidationAdapter);
    }
}
