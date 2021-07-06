package com.Miit.java;

import java.util.*;

public class Calculator {
	static Functions f1 = new Functions();

	public static void main(String[] args) {
		device();
	}

	public static void device() {
		System.out.println("Choose your operator:'+','-','*','/'");
		Scanner s = new Scanner(System.in);
		char operator = s.next().charAt(0);
		
		switch (operator) {
		case '+':
			f1.add();
			break;
		case '-':
			f1.substract();
			break;
		case '*':
			f1.multiply();
			break;
		case '/':
			f1.division();
			break;
		case 'e':
			f1.exit();
			break;
		default:
			System.out.println("wrong operator");
			return;
		}
		device();
	}
}
