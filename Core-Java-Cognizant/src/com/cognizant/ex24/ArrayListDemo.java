package com.cognizant.ex24;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> students = new ArrayList<>();

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter student name: ");
			String name = sc.nextLine();
			students.add(name);

		}
		System.out.println("\nStudent List: ");

		for (String s : students) {
			System.out.println(s);
			sc.close();
		}

	}

}
