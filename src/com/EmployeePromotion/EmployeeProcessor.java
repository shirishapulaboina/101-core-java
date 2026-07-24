package com.EmployeePromotion;
import java.util.*;
public class EmployeeProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee Id:");
		int empId=sc.nextInt();
		System.out.println("enter employee Name:");
		String empName=sc.next();
		System.out.println("enter employee  Designation:");
		String empDesg=sc.next();
		System.out.println("enter employee Salary:");
		double empSalray=sc.nextDouble();
		System.out.println("enter performace Rating:");
		int rating=sc.nextInt();
		Employee obj=new Employee(empId,empName,empDesg,empSalray,rating);
		
		System.out.println("=====================");
		System.out.println("Before Promotion:");
		System.out.println();
		System.out.println("Employee Id:"+obj.getEmpId());
		System.out.println("Employee Name:"+obj.getName());
		System.out.println("Employee Designation:"+obj.getDesignation());
		System.out.println("Employee salary:$"+obj.getSalary());
		System.out.println("Performance Rating:"+obj.getPerformanceRating());
		System.out.println();
	
		obj.promoteEmployee(empDesg);
		



	}

}
