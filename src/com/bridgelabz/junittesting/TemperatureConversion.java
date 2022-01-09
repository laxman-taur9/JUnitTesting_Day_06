package com.bridgelabz.junittesting;
import java.util.Scanner;

public class TemperatureConversion {
 public static void main(String[] args) {
  //Scanner object for User Input
	 
	 Scanner sc = new Scanner(System.in);
	 
	 //Menu for Temperature Conversion
	 System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \n please Enter your choice: ");
	 int choice = sc. nextInt();
	 
	 //Selecting Statement for Multiple options
	 switch(choice) {
	 case 1:
		 System.out.println("Enter the Temperature in Fahrenheit: ");
		 double fahrenheit = sc.nextDouble();
		 double celsius = (fahrenheit - 32) * 5/9;
		 System.out.println("The Temperature in celsius is:"+ celsius);
		 break;
		 
	case 2:
		System.out.println("Enter the Temperature in Celsius: ");
		 celsius = sc.nextInt();
		 fahrenheit = (celsius * 9 /5)+32;
		 System.out.println("The Temperature in Fahrenheit is:"+fahrenheit);
	 }
 }
}
