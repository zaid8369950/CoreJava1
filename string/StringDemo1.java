package com.string;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city name");
		String name = sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad"))
		{
			System.out.println("Hello Hyderabadi,adaab....");			
		}
		else if(name.equals("mumbai")) {
			System.out.println("Aur bantai kya bolte........");
		}
		else if(name.equals("islamabad")) {
			System.out.println("Assalam Walaikum Bhai.......");
		}
		else {
			System.out.println("Enter a valid city name");
		}
		
	}

}
