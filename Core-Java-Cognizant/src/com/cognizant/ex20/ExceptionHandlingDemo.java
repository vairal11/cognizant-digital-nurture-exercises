package com.cognizant.ex20;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter first number: ");
			int a = sc.nextInt();

			System.out.println("Enter second number: ");
			int b = sc.nextInt();

			int result = a / b;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");

		} catch (Exception e) {
			System.out.println("Error: Invalid Input!");

		} finally {
			System.out.println("program finished.");
			sc.close();
		}

	}

}
