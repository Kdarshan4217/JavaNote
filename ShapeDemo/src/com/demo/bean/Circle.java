package com.demo.bean;

public class Circle extends Shape {
	private int radius;
	

	public Circle() {
		super();
	}

	public Circle(String color,int radius) {
		super(color);
		this.radius = radius;
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public float calculateArea(){
		System.out.println("Area of Circle");
		return 3.14f*radius*radius;
	}

    @Override
	public float calculatePerimeter(){
    	System.out.println("Perimeter of Circle");
		return 2*3.14f*radius;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
