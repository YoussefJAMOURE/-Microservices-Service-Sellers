package io.microservices.sellersService.DataSeed;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import io.microservices.sellersService.beans.Seller;
import io.microservices.sellersService.repositories.SellersRepository;

@Component
public class Seed {

	@Autowired
	SellersRepository sellersRepo;
	
	@PostConstruct
	private void seeding() {
		Faker faker = new Faker();
		List<Seller> data = new ArrayList<Seller>();
		for (int i = 0; i < 3; i++) {
			Seller seller = new Seller();
			seller.setName(faker.name().firstName());
			seller.setLastname(faker.name().lastName());
			data.add(seller);
		}
		sellersRepo.saveAll(data);
	}

}
