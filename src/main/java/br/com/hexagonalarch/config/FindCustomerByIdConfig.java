package br.com.hexagonalarch.config;

import br.com.hexagonalarch.adapters.out.FindAddressByZipCodeAdapter;
import br.com.hexagonalarch.adapters.out.FindCustomerByIdAdapter;
import br.com.hexagonalarch.adapters.out.InsertCustomerAdapter;
import br.com.hexagonalarch.application.core.usecase.FindCustomerByIdUseCase;
import br.com.hexagonalarch.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
