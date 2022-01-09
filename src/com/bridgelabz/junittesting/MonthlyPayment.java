package com.bridgelabz.junittesting;

public class MonthlyPayment {
  public static void main(String[] args) {
	  //Taking Commandline Argument Input
	  double P = Double.parseDouble(args[0]);
	  double R = Double.parseDouble(args[1]);
	  double Y = Double.parseDouble(args[2]);
	  
	  //calculating n and r values
	  double n = 12 * Y;
	  double r = R / (12 * 100);
	  
	  //Calculating Month Payment Using given formula
	  double monthPayment = (P*r)/(1 -(Math.pow((1+r), (-n)) ));
	  System.out.println("The Payment per month is :"+monthPayment);
  }
}
