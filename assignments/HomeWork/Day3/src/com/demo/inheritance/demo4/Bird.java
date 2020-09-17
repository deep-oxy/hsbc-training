package com.demo.inheritance.demo4;

/*Create an abstract class Bird and create 3 named sub classes like Parrot, Eagle and Duck. 
Design appropriate common methods in the Bird class and override them in the respective sub classes 
to show appropriate behavior of a named bird.*/

public abstract class Bird {
	protected int length;
	protected int height;

	public Bird(int length, int height) {

		this.length = length;
		this.height = height;
	}

	abstract public String size();

}
