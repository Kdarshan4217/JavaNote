package com.demo.services;

import com.demo.bean.Account;

public interface AccountInterface {

	void addAccount();

	Account[] findAll();

	double findBalance(int id, int pin);

	int deleteAccount(int id, int pin);

	
}
