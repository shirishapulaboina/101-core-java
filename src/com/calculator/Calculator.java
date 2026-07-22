package com.calculator;

public class Calculator {
	int a;
	int b;
	int addition,sub,mul;
	int div;
	public void add() {
	    a = 20;
	    b = 10;
	    addition = a + b;
	}

	public void sub() {
	    a = 20;
	    b = 10;
	    sub = a - b;
	}

	public void mul() {
	    a = 20;
	    b = 10;
	    mul = a * b;
	}

	public void div() {
	    a = 20;
	    b = 10;
	    div = a / b;
	}
	public void display() {
		System.out.println("Addition:"+addition);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+mul);
		System.out.println("Division:"+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
