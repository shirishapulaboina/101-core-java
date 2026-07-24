package com.EmployeePromotion;
import java.util.*;

public class BankProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account number:");
		int accountNumber=sc.nextInt();
		System.out.println("enter the account holder name:");
		String accountHolderName=sc.next();
		System.out.println("enter the Balance:");
		double balance=sc.nextDouble();
		System.out.println("enter the amount");
		double amount=sc.nextDouble();
		BankAccount obj=new BankAccount(accountNumber,accountHolderName,balance);
		
		System.out.println("Account Number:"+obj.getAccountNumber());
		System.out.println("Account holder:"+obj.getAccountHolder());
		System.out.println("current Blance:"+obj.getBalance());
		System.out.println();
		System.out.println("After deposit:");
		
		obj.deposit(amount);
		System.out.println();
		
		System.out.println("After withdraw:");
	
		obj.withdraw(amount);

	}

}
