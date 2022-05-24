/******************************************************************************
Programmer: Seth Prevott
Date: 03/25/2021
Lab 10
Instructor: Dr. Rafael Azuaje
College: San Antonio College
*******************************************************************************/

import java.util.Scanner;
public class DemoHorses {
	public static void main(String [] args) {
		RaceHorse x = new RaceHorse();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of the horse ->: ");
		String a = sc.nextLine();
		System.out.print("Enter the color of the horse ->: ");
		String b = sc.nextLine();
		System.out.print("Enter the year the horse was born ->: ");
		int c = sc.nextInt();
		System.out.print("Enter the number of races the horse has completed ->: ");
		int d = sc.nextInt();
		
		x.setName(a);
		x.setColor(b);
		x.setYear(c);
		x.setRaces(d);
		sc.close();
		
		System.out.println("Horse Name ->: " + x.getName());
		System.out.println("Horse Color ->: " + x.getColor());
		System.out.println(x.getName() + " was born in " + x.getYear() + ".");
		System.out.println(x.getName() + " has completed " + x.getRaces() + " races.");
		
	}

}
