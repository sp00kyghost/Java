/******************************************************************************
Programmer: Seth Prevott 
Date: 02/23/2022
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

import java.util.Scanner;

public class ThreeLetterAcronym {

	public static void main(String[] args) {
		String[] fullTLA = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three words to be converted ->: ");
		for(int x=0;x<3;x++) {
			fullTLA[x]=sc.next();
		}
		System.out.println("The acronym for the words is ->: ");
		for(int x=0;x<3;x++) {
			String s=Character.toString(fullTLA[x].charAt(0));
			String t=s.toUpperCase();
			System.out.print(t);
		}
		sc.close();
	}

}
