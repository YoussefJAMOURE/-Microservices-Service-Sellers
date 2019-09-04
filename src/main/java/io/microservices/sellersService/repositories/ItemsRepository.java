package io.microservices.sellersService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.microservices.sellersService.beans.Item;



public interface ItemsRepository extends JpaRepository<Item, Integer> {

}
