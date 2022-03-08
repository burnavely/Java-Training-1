package com.javaslidesexercise.exercise38;


public class Sum {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException ex) {
			System.out.println("One of the arguments are not number." + "Program exits.");
			return;
		}
		int sum = a + b;
		System.out.println("Sum = " + sum);

	}

}
