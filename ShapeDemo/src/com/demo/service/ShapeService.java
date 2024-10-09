package com.demo.service;

import java.util.Scanner;

import com.demo.bean.Circle;
import com.demo.bean.Shape;
import com.demo.bean.Triangle;
import com.demo.bean. Reactangle;

public class ShapeService {
	
	static Shape[] s;
	static int count;
	static {
		s=new Shape[3];
		count=0;
		
	}

	public static void acceptAllData(int choice) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color for the shape ");
	    String color=sc.next();
	    if(choice==1) {
	    	System.out.println("Enter the base ");
	    	int b=sc.nextInt();
	    	System.out.println("Enter the Height ");
	    	int H=sc.nextInt();
	    	System.out.println("Enter the Side1 ");
	    	int s1=sc.nextInt();
	    	System.out.println("Enter the Side2 ");
	    	int s2=sc.nextInt();
	    	s[count]=new Triangle(color,b,H,s1,s2);
	    }else if(choice==2) {
	    	System.out.println("Get the radius");
	    	int r=sc.nextInt();
	    	s[count]=new Circle(color,r);
	    }else {
	    	System.out.println("Get the base");
	    	int b=sc.nextInt();
	    	System.out.println("Get the height");
	    	int h=sc.nextInt();
	    	s[count]=new Reactangle(color,b,h);
	    		
	    }
	    count++;
	    
		
	}

	public static void CalculateDetiles(int pos) {
		// TODO Auto-generated method stub
		System.out.println(pos+" : "+s[pos].calculateArea());
		System.out.println(pos+" : "+s[pos].calculatePerimeter());
		
	}
	
	
	

	public static Shape[] getAllShape() {
		// TODO Auto-generated method stub
		return s;
	}

}
