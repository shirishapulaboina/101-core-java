package com.employee;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	
	public void displayEmployee(){
		employeeId=1001;
		employeeName="Ravi";
		salary=45000;
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Salary:"+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
