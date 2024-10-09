package com.demo.bean;

public class Triangle extends Shape{
 private int base,height,side1,side2;
 
 

public Triangle() {
	super();
}

public Triangle(String color,int base, int height, int side1, int side2) {
	super(color);
	this.base = base;
	this.height = height;
	this.side1 = side1;
	this.side2 = side2;
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

public int getSide1() {
	return side1;
}

public void setSide1(int side1) {
	this.side1 = side1;
}

public int getSide2() {
	return side2;
}

public void setSide2(int side2) {
	this.side2 = side2;
}
public float calculateArea(){
	System.out.println("Area of Triangle");
	return 0.5f*base*height;
}

@Override
public float calculatePerimeter(){
	System.out.println("Perimeter of Triangle");
	return base+side1+side2;
}

@Override
public String toString() {
	return "Triangle [base=" + base + ", height=" + height + ", side1=" + side1 + ", side2=" + side2 + "]";
}
 


}
