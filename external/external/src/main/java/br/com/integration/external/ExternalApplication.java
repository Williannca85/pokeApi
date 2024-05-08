package br.com.integration.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExternalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApplication.class, args);
	}
	//implementação já existe no servidor http. o backend já existe
}
