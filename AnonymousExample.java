//package com.example;
abstract class Vehicle{
	abstract void setEngine();
}

public class AnonymousExample {

	public static void main(String[] args) {
		Vehicle v1 =new Vehicle() {
			
			
			void setEngine() {
				System.out.println("Inside setengine method");
				
			}
		};
		
		v1.setEngine();

	}

}
