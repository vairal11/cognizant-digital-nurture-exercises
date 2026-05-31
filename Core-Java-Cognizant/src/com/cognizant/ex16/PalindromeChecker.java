package com.cognizant.ex16;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		String cleanStr=str.replaceAll("[^a-zA-Z0-0]","").toLowerCase();
		
		String reversed="";
		
		for(int i=cleanStr.length()-1;i>=0;i--) {
			reversed+=cleanStr.charAt(i); 
			
		}
		
		if(cleanStr.equals(reversed) ) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("Not a Psalindrome");
		}
	}

}
