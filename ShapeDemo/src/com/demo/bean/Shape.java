package com.demo.bean;

public abstract class Shape {
	private String color;
	
	

	public Shape() {
		super();
	}


	public Shape(String color) {
		super();
		this.color = color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

     abstract public float calculateArea();
      
     abstract public float calculatePerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
}
