package com.cognizant.ex23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) {

		File file = new File("output.txt");

		try {
			Scanner reader = new Scanner(file);

			System.out.print("File content: ");

			while (reader.hasNext()) {

				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}

}
