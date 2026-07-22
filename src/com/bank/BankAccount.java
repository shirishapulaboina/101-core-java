package com.bank;

public class BankAccount {
	public String bankName;
    private double balance;
    protected String branchName;
    int accountNumber;  
    public void setDetails() {
    	bankName = "SBI";
        branchName = "Hyderabad";
        accountNumber = 123456;
        balance = 50000.0;
    	
    }
    public double getBalance() {
    	return balance;
    }
    public void display() {
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Branch Name    : " + branchName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		obj.setDetails();

		obj.display();

	}

}
