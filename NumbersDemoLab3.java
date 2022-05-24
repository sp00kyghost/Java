/******************************************************************************
Programmer: Seth Prevott
Date: 02/02/2022
Lab 3
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/

public class NumbersDemoLab3 {

	public static void displayTwiceTheNumber(int N) {
		System.out.println("Twice the number 10: "+ N * 2);
	}
	public static void displayNumberPlusFive(int N) {
		System.out.println("5 plus five: "+ (N + 5));
	}
	public static void displayNumberSquared(int N) {
		System.out.println("10 squared is: " + (N * N));
	}
	public static void main(String[] args) {
		int N1 = 5;
		int N2 = 10;
		
		displayTwiceTheNumber(N2);
		displayNumberPlusFive(N1);
		displayNumberSquared(N2);

	}

}
