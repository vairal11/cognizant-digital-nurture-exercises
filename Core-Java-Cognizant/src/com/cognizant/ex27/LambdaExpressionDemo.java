package com.cognizant.ex27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Kajal");
		names.add("Nalini");
		names.add("Sahil");
		names.add("Reshma");

		System.out.println("Before Sorting:");
		System.out.println(names);

		Collections.sort(names, (a, b) -> a.compareTo(b));

		System.out.println("After Sorting:");
		System.out.println(names);

	}

}
