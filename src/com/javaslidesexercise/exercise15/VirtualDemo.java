package com.javaslidesexercise.exercise15;


public class VirtualDemo {

	public static void main(String[] args) {
		Salary s= new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("\nCall mailCheck using Salary Reference -- ");
		s.mailCheck();
		System.out.println("\nCall mailCheck using Employee reference -- ");
		e.mailCheck();

	}

}
