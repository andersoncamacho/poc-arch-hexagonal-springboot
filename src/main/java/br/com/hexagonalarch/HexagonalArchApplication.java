package br.com.hexagonalarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HexagonalArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalArchApplication.class, args);
	}

}
