package br.com.integration.externals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExternalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalsApplication.class, args);
	}

}
