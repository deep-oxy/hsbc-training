package com.demo.inheritance.demo3;

public class Circle extends Figure {

	public Circle(int dim1) {
		super(dim1);
		
	}

	@Override
	public double area() {
		
		System.out.println("Area of circle = " + (3.14 * dim1 * dim1));
		return 3.14*dim1*dim1;
	}

}
