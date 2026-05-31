package com.cognizant.ex07;

public class TypeCastingDemo {

	public static void main(String[] args) {

		int intValue = 100;
		double doubleValue = intValue;

		double num = 99.99;
		int convertedInt = (int) num;

		System.out.println("Original int value: " + intValue);
		System.out.println("Converted to double: " + doubleValue);

		System.out.println("Original double value: " + num);
		System.out.println("Converted to int: " + convertedInt);

	}

}
