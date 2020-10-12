package com.jay.assorted;

public class Product {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "id/name/price: " + this.id + "/" + this.name + "/" + this.price;
	}
}
