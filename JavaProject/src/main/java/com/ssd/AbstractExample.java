package com.ssd;

public abstract  class AbstractExample {
	public abstract void makeSound();
	
	public void eat() {
		System.out.println("animal is eating");
		System.out.println("dog bite");
	}

}
//makeSound() is not implimented by itself, any concrete subclass of animal must 
// provided an implimentation for 