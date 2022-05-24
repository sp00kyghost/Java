/******************************************************************************
Programmer: Seth Prevott 
Date: 02/15/2022
Lab 5
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		System.out.println("Welcome to Horizon Phones!"); //Intro to program.
		
		//Create scanner for input. Create variables.
		Scanner myObj = new Scanner(System.in);
		int minspm;
		int txtsnt;
		int gigdata;
		
		System.out.print("Please enter the amount of minutes used in a month ->: ");
		minspm = myObj.nextInt();
		System.out.print("Please enter the amount of texts sent in a month ->: ");
		txtsnt = myObj.nextInt();
		System.out.print("Please enter the amount of Gigabytes (GB) used in a month ->: ");
		gigdata = myObj.nextInt();
		
		//Begin loop (future upgrade, turn this into a function and call on it again to verify input.)
		if (minspm<500 && txtsnt==0 && gigdata==0) {
			System.out.println("Horizon Phones Recommends 'PLAN A' for 49$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		else if(minspm<500 && txtsnt>0 && gigdata==0) {
			System.out.println("Horizon Phones Recommends 'PLAN B' at 55$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		else if(minspm>=500 && txtsnt<=100 && gigdata==0) {
			System.out.println("Horizon Phones Recommends 'PLAN C' at 61$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		else if(minspm>=500 && txtsnt>100 && gigdata==0) {
			System.out.println("Horizon Phones Recommends 'PLAN D' at 70$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		else if(gigdata<=2) {
			System.out.println("For any data up to 2 GB, Horizon Phones Recommends 'PLAN E' at 79$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		else if(gigdata>2) {
			System.out.println("For any data over 2 GB, Horizon Phones Recommends 'PLAN F' at 87$ per month.");
			System.out.println("Thank you for choosing our services!");
		}
		
		myObj.close();

	}

}
