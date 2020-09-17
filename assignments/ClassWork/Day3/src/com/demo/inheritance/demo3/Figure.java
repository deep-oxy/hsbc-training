package com.demo.inheritance.demo3;

public abstract class Figure {

	protected int dim1;
	protected int dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public Figure(int dim1) {
		this.dim1 = dim1;
	}

	abstract public double area();

	public void fun() {
		System.out.println("Having fun...");
	}

}
