package com.demo.bean;

public class Reactangle extends Shape{
	int base,height;

	public Reactangle() {
		super();
	}

	public Reactangle(String color,int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public float calculateArea(){
		System.out.println("Area of Reactangle");
		return base*height;
	}

  
	public float calculatePerimeter(){
		System.out.println("Perimeter of Reactangle");
		return 2*(base+height);
	}

	@Override
	public String toString() {
		return "Reactangle [base=" + base + ", height=" + height + "]";
	}
	
	
}
