package com.bridgelabz.junittesting;

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
	  
	  //Scanner object for User Input
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("Enter the Decimal Number:");
	  int num = sc. nextInt();
	  
	  int temp =num , i=0, j=0;
	  
	  //Initializing array for storing binary values
	  int[] arr= new int[8];
	  
	  //repeat till temp is Zero
	  while(temp !=0) {
		  arr[i] = temp %2;
		  temp = temp /2;
		  i++;
		  
	  }
	  //printing the binary and decimal compostions
	  for(j = i-1; j >= 0; j--) {
		  System.out.println(arr[j]);
		  if(arr[j]==1) {
			  int no =(int)Math.pow(2,j);
			  System.out.println(arr[j]+"\t"+no);
		  }else {
			  System.out.println(arr[j]+"\t0");
		  }
	  }
	  
  }
}
