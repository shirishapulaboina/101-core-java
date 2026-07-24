package com.EmployeePromotion;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	public BankAccount(int accountNumber,String accountHolder,double balance) {
		this.accountNumber= accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}  
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposit amount:"+amount);
			System.out.println("updated Balance"+balance);
		}
		else {
			System.out.println("Insufficient balance:");
		}
	}
	public void withdraw(double amount) {
		if(balance>=amount && amount>0) {
			balance-=amount;
			System.out.println("debited amount:"+amount);
			System.out.println("updated Balance"+balance);
			
		}
		else {
			System.out.println("Insufficient balance:");
		}
	}

}
