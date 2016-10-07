package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int integer;
		Scanner scanf= new Scanner (System.in);
		
		System.out.printf("Enter a integer:");
		integer= scanf.nextInt();
		
		if(integer%2==0) System.out.printf("The input integer is Even Number.");
		else System.out.printf("The input integer is Odd Number.");
		
		scanf.close();
	

	}

}
