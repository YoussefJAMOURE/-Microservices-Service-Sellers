package io.microservices.sellersService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.microservices.sellersService.beans.Seller;

public interface SellersRepository extends JpaRepository<Seller, Integer> {

}
