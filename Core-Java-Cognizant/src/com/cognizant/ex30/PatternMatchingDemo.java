package com.cognizant.ex30;

public class PatternMatchingDemo {

	public static void printType(Object obj) {

		if (obj instanceof Integer i) {
			System.out.println("Integer value: " + i);
		} else if (obj instanceof String s) {
			System.out.println("String value: " + s);
		} else if (obj instanceof Double d) {
			System.out.println("Double value: " + d);
		} else if (obj == null) {
			System.out.println("Null value");
		} else {
			System.out.println("Unknown type");
		}
	}

	public static void main(String[] args) {

		printType(100);
		printType("Hello Java");
		printType(99.99);
		printType(null);
	}
}