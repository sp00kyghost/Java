/******************************************************************************
Programmer: Seth Prevott
Date: 02/02/2022
Lab 3
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/
import java.util.Scanner;

public class BookstoreCredit {
	public static void main(String[] args) {
		String stuName;
		double stuGpa;
		double bscredit = 10;
		
		Scanner c = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		stuName = c.next();
		System.out.print("Please enter your GPA " + stuName + ": ");
		stuGpa = c.nextDouble();
		calccredit(stuName, stuGpa, bscredit);
	}
	
	public static void calccredit(String stuName, double stuGpa, double bscredit) {
		double totalcred = stuGpa * bscredit;
		System.out.println(stuName + " your GPA is " + stuGpa + " so your total Bookstore credit is $" + totalcred + ".");
	}

}
