//Dalya Wiliam  & Guy Rahamim .
//Assignment 5


package lab5;

import java.util.Scanner;

public class Exe_5_rectangel {

	public static void main(String[] args) {
		
		//initializing variable
		int num;
		
		
		
		//taking in user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		num = sc.nextInt();
		
		
		
		// Print multiple rows and columns as a number of what you received
		int i; int j;
		
		for (i = 0; i< num ; i++) 
		{
			for(j=0 ; j<num ; j++)
			{
			System.out.print(" * ");
			}
			System.out.println("");

		}
		
		
		sc.close();
		
	}

}
