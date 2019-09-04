package io.microservices.sellersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EntityScan("io.microservices.sellersService.beans")
@EnableJpaRepositories("io.microservices.sellersService.repositories")
@SpringBootApplication
public class SellersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellersApplication.class, args);
	}

}
