package io.microservices.sellersService.DataSeed;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import io.microservices.sellersService.beans.Item;
import io.microservices.sellersService.beans.Seller;
import io.microservices.sellersService.repositories.ItemsRepository;
import io.microservices.sellersService.repositories.SellersRepository;

@Component
public class Seed {

	@Autowired
	transient SellersRepository sellersRepo;
	
	@Autowired
	transient ItemsRepository itemsRepo;
	
	@Value("${seeding.sellers}")
	transient Integer NUMBER_OF_SELLERS;
	
	@Value("${seeding.items}")
	transient Integer NUMBER_OF_ITEMS;
	
	@PostConstruct
	private void seeding() {
		Faker faker = new Faker();
		List<Seller> sellersData = new ArrayList<Seller>();
		List<Item> itemsData = new ArrayList<Item>();
		
		for (int id = 0; id < NUMBER_OF_ITEMS; id++) {
			itemsData.add(new Item(id));
		}
		itemsRepo.saveAll(itemsData);
		
		for (int i = 0; i < NUMBER_OF_SELLERS; i++) {
			Seller seller = new Seller();
			seller.setName(faker.name().firstName());
			seller.setLastname(faker.name().lastName());
			seller.setItems(randomListOfItems());
			sellersData.add(seller);
			
			sellersRepo.save(seller);
		}
		
	}
	
	private List<Item> randomListOfItems(){
		Random randomizer = new Random();
		List<Item> itemsData = new ArrayList<Item>();
		for (int i = 0; i < 3; i++) {
			itemsData.add(new Item(randomizer.nextInt(NUMBER_OF_ITEMS)));
		}
		return itemsData;
	}

}
