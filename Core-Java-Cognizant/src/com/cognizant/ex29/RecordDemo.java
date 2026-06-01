package com.cognizant.ex29;

import java.util.Arrays;
import java.util.List;

public class RecordDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Anjana", 16);
		Person p2 = new Person("Pushpa", 52);
		Person p3 = new Person("balu", 21);
		Person p4 = new Person("madhu", 42);

		System.out.println("Person Records: ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		List<Person> people = Arrays.asList(p1, p2, p3, p4);

		System.out.println("\nPeople age 18 and above:");

		people.stream().filter(person -> person.age() >= 18).forEach(System.out::println);

	}

}
