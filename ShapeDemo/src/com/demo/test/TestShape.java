package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Circle;
import com.demo.bean.Reactangle;
import com.demo.bean.Shape;
import com.demo.bean.Triangle;
import com.demo.service.ShapeService;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choices=0;
		for(int i=0;i<3;i++) {
			System.out.println("1.Triange\n2.Circle\n3.Rectangle\n");
			choices=sc.nextInt();
			ShapeService.acceptAllData(choices);
		}
		for(int i=0;i<3;i++) {
			ShapeService.CalculateDetiles(i);
		}
		
		int counttraingle=0;
		int countcircle=0;
		int countrectangle=0;
		
		Shape[] obj= ShapeService.getAllShape();
		for (int i = 0; i < obj.length; i++) {
			if(obj[i] instanceof Triangle) {
				 counttraingle++;
			}else if(obj[i] instanceof Circle) {
				 countcircle++;
			}else if(obj[i] instanceof Reactangle) {
				 countrectangle++;
			}	
		}
		
        System.out.println("Triangle Count: "+counttraingle);
		System.out.println("Circle Count: "+countcircle);
		System.out.println("Rectangle Count: "+countrectangle);
		

	}

}
