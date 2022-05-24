/******************************************************************************
Programmer: Seth Prevott
Date: 02/02/2022
Lab 3
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/

public class Percentages {
	
	public static void main(String[] args) {
		double N1 = 2.0;
		double N2 = 5.0;
		
		calcPercent(N1, N2);
		calcPercent(N2, N1);
	}
	public static void calcPercent(double N1, double N2) {
		System.out.println(N1 + " is " + N1/N2*100 + "% of " + N2);
	}
}
