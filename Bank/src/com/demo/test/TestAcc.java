package com.demo.test;

import java.util.Iterator;
import java.util.Scanner;

import com.demo.bean.Account;
import com.demo.services.AccountInterface;
import com.demo.services.AccountServicesImpt;

public class TestAcc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountInterface a=new AccountServicesImpt();
		int choices=0;
		do {
			System.out.println("1.Add new Account\n2.delete account\n3.withdrawal\n4.deposit\n5.check balance\n6.display all\n7.exist\n choices:");
			choices=sc.nextInt();
			switch(choices) {
			case 1:a.addAccount();
				break;
				
			case 2:
				System.out.println("eneter id");
				int id=sc.nextInt();
				System.out.println("get pin");
				int pin=sc.nextInt();
				int status = a.deleteAccount(id, pin);
				if(status>=0) {
					System.out.println("Account closed");
				}else if(status==-1) {
					System.out.println("not found");
				}else if(status==-5) {
					System.out.println("id is wrong");
				}else {
					System.out.println("pin is wrong");
				}
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				
			System.out.println("eneter id");
			 id=sc.nextInt();
			System.out.println("get pin");
			 pin=sc.nextInt();
			
			double bal=a.findBalance(id,pin);
			if(bal>0) {
				System.out.println("Balance of account  :"+id+": " +bal);
			}else if(bal==-1) {
				System.out.println("not found");
			}else {
				System.out.println("pin is wrong");
			}
		
				break;
			case 6:
				Account[] arr=a.findAll();
				for (int i = 0; i < arr.length; i++) {
					System.out.println(i + "  " + arr[i]);
				}
				/*
				 * for (Account ac : arr) { if(ac != null) System.out.println(ac); else break; }
				 */
				break;
			case 7:System.out.println("Thanku for visiting....");
				break;
				default:System.out.println("no choices avaliable");
					break;
						
			}
		}while(choices!=7);
	}

}
