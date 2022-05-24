/******************************************************************************
Programmer: Seth Prevott
Date: 4/08/2022
Lab 12 
Instructor: Dr. Rafael Azuaje
College: San Antonio College
*******************************************************************************/

import java.util.Scanner;
public class BadSubscriptCaught {

	public static void main(String[] args) {
		String[] names = {"Seth","Madison","Nesto","Jem","Kevin","John","Kyle","Brady","Bryce","Arthur"};
	
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter an index number for the array ->: ");
			int indx = sc.nextInt();
			
			System.out.println("The resulting index points to " + names[indx] + ".");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " is not a valid index number in the array.");
			e.printStackTrace();
		}
		sc.close();
	}

}
