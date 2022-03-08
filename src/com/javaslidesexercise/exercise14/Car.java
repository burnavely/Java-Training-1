package com.javaslidesexercise.exercise14;


public class Car {

	private String colour;
	private int maxi_Speed;
	
	public void carDetails() {
		System.out.println("Car Coulour= " + colour + "; Maximum Speed = " + maxi_Speed) ; 
	}
	
	public void setColour (String colour) {
		this.colour = colour;
	}
	
	public void setMaxiSpeed(int maxi_Speed) {
		this.maxi_Speed = maxi_Speed;
	}
}
