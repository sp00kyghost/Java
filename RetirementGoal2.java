/******************************************************************************
Programmer: Seth Prevott 
Date: 02/23/2022
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

import java.util.Scanner;

public class RetirementGoal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double amtSaved, totalSaved;
		
		System.out.println("Enter number of years until retirement ->: ");
		x = sc.nextInt();
		
		while (x<=0) {
			System.out.println("Invalid input detected. Please enter a number larger than 0.");
			System.out.print("Enter number of years until retirement ->: ");
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
		totalSaved = amtSaved*x*((100-5)/100.0);
		
		System.out.println("The amount of money saved by retirement with interest is " + totalSaved + ".");

	}

}
