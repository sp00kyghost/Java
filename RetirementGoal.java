/******************************************************************************
Programmer: Seth Prevott 
Date: 02/23/2022
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

import java.util.Scanner;

public class RetirementGoal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		double amtSaved, totalSaved;
		
		System.out.print("Please enter the number of years until retirement ->: ");
		x = sc.nextInt();
		
		while (x<=0) {
			System.out.println("Invalid input detected. Please enter a number larger than 0.");
			System.out.print("Please enter the number of years the user has until retirement ->: ");
			x = sc.nextInt();
		}
		
		System.out.print("Enter the amount of money you save per check ->: ");
		amtSaved = sc.nextDouble();
		
		while (amtSaved<=0) {
			System.out.println("Invalid input detected. Please enter a number larger than 0.");
			System.out.print("Enter the amount of money you save per check ->: ");
			amtSaved = sc.nextDouble();
		}
		sc.close();
		totalSaved = amtSaved*x;
		
		System.out.println("Amount of money saved by retirement is $" + totalSaved + ".");

	}

}
