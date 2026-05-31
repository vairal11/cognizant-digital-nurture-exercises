package com.cognizant.ex12;

public class MethodOverloadingDemo {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverloadingDemo obj = new MethodOverloadingDemo();

		System.out.println("Sum of 2 integers: " + obj.add(10, 20));
		System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));
		System.out.println("Sum of 2 doubles: " + obj.add(20.0, 20.0));

	}

}
