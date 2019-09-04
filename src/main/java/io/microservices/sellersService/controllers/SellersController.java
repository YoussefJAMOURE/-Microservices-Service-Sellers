package io.microservices.sellersService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.sellersService.beans.Seller;
import io.microservices.sellersService.repositories.SellersRepository;

@RestController
@RequestMapping("sellersWS")
public class SellersController {
	
	@Autowired
	SellersRepository sellersRepo;
	
	@GetMapping(value  = "/isUp")
	public String isUp(){
		return "Yeah it is !";
	}
	
	@GetMapping(value = "/getAll")
	public List<Seller> getAllSellers(){
		return sellersRepo.findAll();
	}
}
