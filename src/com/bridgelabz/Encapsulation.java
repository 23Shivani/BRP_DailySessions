package com.bridgelabz;

public class Encapsulation{
	public static void main(String args[]){
		Encapsulation1 obj = new Encapsulation1();
		obj.setFirstName("Rupali");
		obj.setLastName("Deshmukh");
		obj.setAddress("Amravti");;
		System.out.println("First Name: " + obj.getFirstName());
		System.out.println("Last Name: " + obj.getLastName());
		System.out.println("Address: " + obj.getAddress());
		} 
}