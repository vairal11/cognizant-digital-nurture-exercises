package com.cognizant.ex21;

import java.util.Scanner;

public class AgeValidator {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		} else {
			System.out.println("Valide age. Access granted.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		sc.close();
	}

}
