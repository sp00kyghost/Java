/******************************************************************************
Programmer: Seth Prevott
Date: 03/25/2021
Lab 10
Instructor: Dr. Rafael Azuaje
College: San Antonio College
*******************************************************************************/

public class BookArray

{
   public static void main(String[] args)

   {

       Book books[] = new Book[10];

       books[0] = new Fiction("Harry Potter: Goblet of Fire");
       books[1] = new Fiction("Shrek's Boogaloo");
       books[2] = new Fiction("How to tame Dragons");
       books[3] = new Fiction("Red Dead Redemption");
       books[4] = new Fiction("Counter-Strike");


       books[5] = new NonFiction("Aliens are out there");
       books[6] = new NonFiction("Book 2");
       books[7] = new NonFiction("Shrek's Swamp Map");
       books[8] = new NonFiction("How to become a millionaire");
       books[9] = new NonFiction("How to win the lottery");
       
       System.out.println("Details of all the books below");

       for(int i = 0; i < books.length; i++)

       {

           System.out.println();

           System.out.println((i + 1) + ".Name:" +

                   books[i].getBookTitle());

           System.out.println("Price:$"+ books[i].getBookPrice());

       }
   }
}