//Dalya Wiliam  & Guy Rahamim .
//Assignment 3



package lab5;

import java.util.Scanner;

public class Exe_3_2nums {

	public static void main(String[] args) {
		
		
		//initializing variables
		int upperBound; int lowerBound; 
		
		//taking in user input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upper bound: ");
		upperBound = sc.nextInt();
		
		System.out.println("enter  lower bound: ");
		lowerBound = sc.nextInt();
		
		
		// make lowerBound to negative number
		lowerBound = 0 - lowerBound;
		
		
		
		// print all the numbers from lowerBound to upperBound
		int i;
		for(i = 0 ; lowerBound <= upperBound ; i++) {
			
			System.out.println(lowerBound);
			lowerBound++;
		}
		
		sc.close();


	}
	
	

}
