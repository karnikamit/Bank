package com.restBankApp;

import java.util.*;


public class Account {
	/*
	 * JAVA BEAN class for Bank Account
	 */
	private int accId = 0;
	private String name = "";
	private double balance = 0;
	private double phoneNumber = 0;
	private int transactionID = 100;
	private Map<Integer, String> history = new HashMap<Integer, String>();

	public Account(Account accountDetails) {
	}

	public int getAccId(){
		return this.accId;
	}

	public void setAccId(int accId){
		this.accId = accId;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPhoneNumber(double phNumber){
		this.phoneNumber = phNumber;
	}

	public void setBalance(double bal, String action){
		this.transactionID += 1;
		if(action == "add"){
			String msg = "Deposited " + bal;
			this.balance += bal;
			this.history.put(this.transactionID, msg);
		}else{
			String msg = "Withdrawn " + bal;
			this.balance -= bal;
			this.history.put(this.transactionID, msg);
		}
	}

	public String getName(){
		return this.name;
	}

	public double getBalance(){
		return this.balance;
	}

	public double getPhoneNumber(){
		return this.phoneNumber;
	}

	public Map<Integer, String> getHistory(){
		return this.history;
	}

	public Account getAccountDetails(){
		return this;
	}

}
