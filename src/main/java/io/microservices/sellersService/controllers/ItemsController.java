package io.microservices.sellersService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.sellersService.beans.Item;
import io.microservices.sellersService.repositories.ItemsRepository;


@RestController
@RequestMapping("itemsWS")
public class ItemsController {

	@Autowired
	ItemsRepository itemsRepo;

	@GetMapping(value = "/isUp")
	public String isUp() {
		return "Yeah it is !";
	}

	@GetMapping(value = "/getAll")
	public List<Item> getAllItems() {
		return itemsRepo.findAll();
	}

	@GetMapping(value = "/addItem")
	public void addItem(@RequestParam Integer id) {
		itemsRepo.save(new Item(id));
	}
	
	@GetMapping(value = "/addItems")
	public void addItems(@RequestParam List<Integer> ids) {
		ids.forEach(id -> itemsRepo.save(new Item(id)));
	}

}
