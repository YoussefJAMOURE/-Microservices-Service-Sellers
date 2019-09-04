package io.microservices.sellersService.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seller {

	@Id
	@GeneratedValue
	private int id_seller;
	private String name;
	private String lastname;
	@OneToMany(mappedBy = "seller")
	private List<Item> items;
	
	public Seller() {
		super();
	}
	
	public Seller(int id, String name, String lastname, List<Item> items) {
		super();
		this.id_seller = id;
		this.name = name;
		this.lastname = lastname;
		this.items = items;
	}

	public int getId() {
		return id_seller;
	}

	public void setId(int id) {
		this.id_seller = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
