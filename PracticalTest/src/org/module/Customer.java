package org.module;

public class Customer {
	private int Id;
	private String Name;
	private int Age;
	public char[] getAge;
	
	public Customer() {
		Id=123;
		Name="Nikita";
		Age=21;
	}
	public Customer(int id,String name,int age) {
		Id=id;
		Name=name;
		Age=age;
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public double getAge() {
		return Age;
	}
	public void setId(int id) {
		Id=id;
	}
	public void setName(String name) {
		Name=name;
	}
	public void setAge(int age) {
		Age=age;
		
	}

}
