/*
Programmer: Seth Prevott 
Date: 01/24/2022
Lab 2
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*/

import java.util.Scanner;
public class IntegerDemoInteractiveWithName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		System.out.print("Please enter an integer: ");
		anInt = input.nextInt();
		System.out.print("Please enter a byte integer: ");
		aByte = input.nextByte();
		System.out.print("Please enter a short integer: ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer: ");
		aLong = input.nextLong();
		System.out.print("Please enter your name!: " + input.nextLine());
		name = input.nextLine();
		System.out.println("The entered integer is: " + anInt);
		System.out.println("The entered byte integer is: " + aByte);
		System.out.println("The entered short integer is: " + aShort);
		System.out.println("The entered long integer is: " + aLong);
		System.out.println("Thank you, " + name + "!");
	}

}
