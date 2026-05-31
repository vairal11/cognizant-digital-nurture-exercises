package com.cognizant.ex13;

import java.util.Scanner;

public class FibonacciRecursive {

	public static int fibonacci(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter position(n): ");
		int n = sc.nextInt();

		System.out.print("Fibonacci Series: ");

		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

		sc.close();

	}

}
