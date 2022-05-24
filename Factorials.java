/******************************************************************************
Programmer: Seth Prevott 
Date: 02/23/2022
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

import java.util.*;

public class Factorials {

	public static void main(String[] args) {
		int num, x, z = 1;
		
		System.out.print("Please enter a number ->: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		for (x=1; x<=num; x++) {
			z = z * x;
		}
		System.out.println("Factorial of " + num + " is ->: " + z);

	}

}
