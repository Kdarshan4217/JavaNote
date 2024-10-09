package com.demo.services;

import java.util.Scanner;

import com.demo.bean.Account;

public class AccountServicesImpt implements AccountInterface {
       static Account[] acarr;
       static int count;
       static {
    	   acarr=new Account[10];
    	   acarr[0]=new Account(1,"Atharva",100000,123456);
    	   acarr[1]=new Account(2,"Danny",200000,5683894);
    	   count=2;
       }
	public void addAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		acarr[count]=new Account(id,name,balance,pin);
		count++;
		System.out.println(count);
	}
	@Override
	public Account[] findAll() {
		// TODO Auto-generated method stub	
		return acarr;
	}
	@Override
	public double findBalance(int id, int pin) {
	int pos = searchById(id,pin);
	if(pos>=0) {
		return acarr[pos].getBalance();
	}
		return pos;
	}
	private int searchById(int id, int pin) {
	       for(int i=0;i<count;i++) {
	    	   if(acarr[i].getAcid()==id) {
	    		   if(acarr[i].getPin()==pin) {
	    			   System.out.println(i);
	    			   return i;
	    			   
	    		   }
	    		   else 
	    			   System.out.println(i);
	    			   return -5;//if pin is wrong
	    	   }
	    }
	       System.out.println();
	       return -1;
		
	}
	
	
	
	@Override
	public int deleteAccount(int id, int pin) {
		// TODO Auto-generated method stub
		int pos = searchById(id,pin);
		count --;
		if(pos>=0) {
			for (int i = pos; i <= count; i++) {
				acarr[i]=acarr[i+1];
			}
		}
		return pos;	
	}
}

	 
		
	


