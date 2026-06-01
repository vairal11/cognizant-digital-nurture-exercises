package com.cognizant.ex22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text to write into file: ");
		String data = sc.nextLine();

		try {
			FileWriter writer = new FileWriter("output.txt");

			writer.write(data);
			writer.close();

			System.out.println("Data successfully written to output.txt");

		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

		sc.close();
	}

}
