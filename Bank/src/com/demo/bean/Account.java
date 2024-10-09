package com.demo.bean;

public class Account {
	private int acid;
	private String acnme;
    private double balance;
    private int pin;
	public Account() {
		super();
	}
	public Account(int acid, String acnme, double balance, int pin) {
		super();
		this.acid = acid;
		this.acnme = acnme;
		this.balance = balance;
		this.pin = pin;
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getAcnme() {
		return acnme;
	}
	public void setAcnme(String acnme) {
		this.acnme = acnme;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account [acid=" + acid + ", acnme=" + acnme + ", balance=" + balance + ", pin=" + pin + "]";
	}
    

}
