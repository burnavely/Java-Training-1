package com.javaslidesexercise.exercise36;


public class Student {

	private String name;
	private int age;
	
	public void setName(String name) {
		if(name == null || name.equals("")) {
			throw new IllegalArgumentException("Name is invalid");
		}
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 1 || age > 100) {
			throw new IllegalArgumentException("Age is invalid");
		}
		this.age=age;
	}
}
