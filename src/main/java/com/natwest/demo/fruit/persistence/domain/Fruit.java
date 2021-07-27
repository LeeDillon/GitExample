package com.natwest.demo.fruit.persistence.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String colour;
	
	private double price;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(Long id, String name, String colour, double price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public Fruit(String name, String colour, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
