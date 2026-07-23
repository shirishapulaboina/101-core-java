package com.EmployeePromotion;

public class BankProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount(123456,"shirisha",5000);
		System.out.println("Account Number:"+obj.getAccountNumber());
		System.out.println("Account holder:"+obj.getAccountHolder());
		System.out.println("current Blance:"+obj.getBalance());
		System.out.println();
		System.out.println("After deposit:");
		
		obj.deposit(5000);
		System.out.println();

		System.out.println("After withdraw:");
	
		obj.withdraw(3000);

	}

}
