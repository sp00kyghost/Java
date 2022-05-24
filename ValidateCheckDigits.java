/******************************************************************************
Programmer: Your name 
Date: 04/16/2022
Lab 13
Instructor: Dr. Rafael Azuaje
College: San Antonio College
Collaborated with John Esquivel
*******************************************************************************/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ValidateCheckDigits {
public static void main(String[] args) {
String fileName = "AccNums.txt"; 
String validFileName = "Valid_AccNums.txt"; 
try(Scanner fileScanner = new Scanner( new File(fileName));
BufferedWriter fileWriter = new BufferedWriter( new FileWriter(validFileName))) {
while(fileScanner.hasNextLine()) {
String line = fileScanner.nextLine().trim();
int sum = 0;
for(int i = 0; i < 5; i++) {
sum += Integer.parseInt( line.charAt(i) + "");
}
int lastDigit = Integer.parseInt(line.charAt(5)+"");
if(sum%10 == lastDigit) {
fileWriter.write(line);
fileWriter.newLine();
System.out.println("Writing valid number to file: " + line);
}
}
System.out.println("Verifying valid numbers completed.");
} catch(IOException ex ) {
System.err.println("Error: Unable to read or write to the file. Check if the input file exists in the same directory.");
}
}
}