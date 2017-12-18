package br.com.diego.financas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.diego.financas.rmi.ContaRMIService;
import br.com.diego.financas.rmi.ContaRMIServiceImpl;

@SpringBootApplication
public class FinancasApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasApplication.class, args);
	}
	
	@Bean
	ContaRMIService contaService() {
	    return new ContaRMIServiceImpl();
	}
}
