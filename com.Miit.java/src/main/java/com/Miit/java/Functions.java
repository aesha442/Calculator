package com.Miit.java;

import java.util.*;

public class Functions {
	
	public double add() {
		double sum = 0;
		System.out.println("Enter the number of elements you want to calculate:");
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		System.out.println("Enter all elements one by one");
		for (int i = 0; i < size; i++) {
			double arr[] = new double [size];
	    	arr[i] = s1.nextDouble();
			sum += arr[i];
		}
		System.out.println("The addition of array is " + sum);
		return sum;
	}

	public double substract() {
		double subtract = 0;
		System.out.println("Enter the number of elements you want to calculate:");
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		System.out.println("Enter all elements one by one");
		for (int i = 0; i < size; i++) {
			double arr[] = new double [size];
			arr[i] = s1.nextDouble();
			if (i == 0) {
				arr[i] = -1 * arr[i];
				subtract = subtract - arr[i];
			} else {
				subtract = subtract - arr[i];
			}
		}
		System.out.println("The subtraction of array is " + subtract);
		return subtract;
	}

	public double multiply() {
		double multiply = 1;
		System.out.println("Enter the number of elements you want to calculate:");
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		System.out.println("Enter all elements one by one");
		for (int i = 0; i < size; i++) {
			double arr[] = new double [size];
			arr[i] = s1.nextDouble();
			multiply = multiply * arr[i];
		}
		System.out.println("The multiplication of array is " + multiply);
		return multiply;
	}

	public double division() {
		System.out.println("Enter the number of elements you want to calculate:");
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		System.out.println("Enter all elements one by one");
		double arr[] = new double [size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextDouble();
		}
		double result = arr[0];
		for (int j = 1; j < size; j++) {
			result = result / arr[j];
		}
		System.out.println("The division of array is " + result);
		return result;
	}

	public void exit() {
		System.exit(0);
	}
}
