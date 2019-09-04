package io.microservices.sellersService.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private int id_item;
	
	@ManyToOne
    @JoinColumn(name="sellerID",referencedColumnName="id_seller")
    private Seller seller;

	
	public Item() {
		super();
	}
	
	public Item(int id) {
		super();
		this.id_item = id;
	}
	
	public Item(int id,Seller seller) {
		super();
		this.id_item = id;
		this.seller = seller;
	}

	public int getId() {
		return id_item;
	}

	public void setId(int id) {
		this.id_item = id;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}
