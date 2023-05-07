package com.ssd;

public class DogAbstrct extends AbstractExample{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("wow");
		
	}
public static void main(String[] args) {
	AbstractExample da= new DogAbstrct();
	da.eat();
		
	}
	
}


