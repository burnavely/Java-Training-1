package com.javaslidesexercise.exercise13;


public class TesEncapsulation {

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);
		
		System.out.println("Geek's Name: " + obj.getName());
		System.out.println("Geek's Age: " + obj.getAge());
		System.out.println("Geek's Roll: " + obj.getRoll());
		
	}

}
