/******************************************************************************
Programmer: Seth Prevott 
Date: 02/15/2022
Lab 5
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/


import java.util.Scanner;

public class Pay {  
	public static void main(String[] args) { 
		Scanner sc = new Scanner (System.in); 
		System.out.print("Employee name: "); 
		String str =sc.next(); 
		System.out.print("Skill level: "); 
		int level =sc.nextInt(); 
		System.out.print("Hours worked: "); 
		int hours =sc.nextInt(); 
		
		if(hours>40){ 
			int x=hours-40; 
			double overtime; 
			if(level==1){ int l1=30; overtime= x*1.5*l1; int leveLL=(40*(l1)); //level2 
			System.out.println("Regular pay: "+leveLL); 
			System.out.println("overtime pay: "+overtime); 
			System.out.println("Total pay: "+(overtime+leveLL)); }
			else if (level == 2){ int l2=40; int leveLL=(40*(l2)); //level2 
			overtime= x*1.5*l2; 
			System.out.println("Regular pay: "+leveLL); 
			System.out.println("Overtime pay: "+overtime); 
			System.out.println("Total pay: "+(overtime+leveLL));} 
			System.out.print("How many option you need? "); 
			int option=sc.nextInt(); 
			if (option==1 ||option==2 ||option==3){ 
				System.out.print("Choose insurance option Medical, Dental or Disability?! "); 
				String o=sc.next(); 
				int Medical=60; 
				int Dental=40; 
				int Disability=25; 
				System.out.println("Total insurance deduction "+o);} 
			if((option==1&&option==2)||(option==1&&option==3)||(option==2&&option==3)){ 
				System.out.print("Choose insurance option Medical, Dental or Disability?!"); 
				String o=sc.next(); 
				int Medical=60; 
				int Dental=40; 
				int Disability=25; 
				System.out.println("Total insurance deduction "+o);} 
			if(option==3){ 
				int Medical=60; 
				int Dental=40; 
				int Disability=25; 
				System.out.println("Total insurance deduction "+(+Medical+Dental+Disability));} }
		else if(level==3){ 
			if(hours>40){ 
				int x=hours-40; 
				int l3=50; 
				int leveLL=(40*(l3)); //level2 
				double overtime3= x*1.5*l3; 
				System.out.println("Regular pay: "+leveLL); 
				System.out.println("overtime pay: "+overtime3); 
				System.out.println("Total pay: "+(overtime3+leveLL)); 
				System.out.print(" insurance option?!..."); 
				int option3=sc.nextInt(); 
				if (option3==1 ||option3==2 ||option3==2);{ 
					System.out.print("Choose insurance option Medical, Dental or Disability?!"); 
					String o=sc.next(); 
					int Medical=60; 
					int Dental=40; 
					int Disability=25; 
					System.out.println("total insurance deduction"+o);} 
				if((option3==1&&option3==2)||(option3==1&&option3==3)||(option3==2&&option3==3)){ 
					System.out.print("Choose insurance option Medical, Dental or Disability?!"); 
					String o=sc.next(); 
					int Medical=60; 
					int Dental=40; 
					int Disability=25; 
					System.out.println("Total insurance deduction "+o);} 
				if(option3==3){ 
					int Medical=60; 
					int Dental=40; 
					int Disability=25; 
					System.out.println("Total insurance deduction "+(+Medical+Dental+Disability));} 
				System.out.print("Do you have retirement option?..."); 
				boolean retirement=sc.hasNext(); }
			else{ System.out.println("Skill level is invalid."); 
			}
		}
	}
}