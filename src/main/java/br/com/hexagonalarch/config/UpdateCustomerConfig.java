package br.com.hexagonalarch.config;

import br.com.hexagonalarch.adapters.out.FindAddressByZipCodeAdapter;
import br.com.hexagonalarch.adapters.out.UpdateCustomerAdapter;
import br.com.hexagonalarch.application.core.usecase.FindCustomerByIdUseCase;
import br.com.hexagonalarch.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {


    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
