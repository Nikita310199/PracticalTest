package org.example.model;
public class Product {
  private int id;
  private String name;
  private double Price;
  
	public Product(int Id, String Name, double price) {
	id = Id;
	name = Name;
    Price = price;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	
}