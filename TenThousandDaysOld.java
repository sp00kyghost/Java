/******************************************************************************
Programmer: Seth Prevott 
Date: 2/09/2022
Lab 4
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/
import java.time.*;

public class TenThousandDaysOld {

	public static void main(String[] args) {
		LocalDate bday = LocalDate.of(1996, 3, 12);
		System.out.println("My birthday is " + bday + " that is " + bday.getMonth() + " " + bday.getDayOfMonth() + " " + bday.getYear() + "\n");
		System.out.println("I will be 10,000 days old on " + bday.plusDays(10000));

	}

}
