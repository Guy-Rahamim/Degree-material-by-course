//Dalya Wiliam  & Guy Rahamim .
//Assignment 1

package lab5;

import java.util.Scanner; 

public class Exe_1_max_min {

	public static void main(String[] args) {
		
		
		
		//initializing variables
		int num1; int num2; int num3; int max; int min;
		
		
		//taking in user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 nums: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		
		//find the biggest num from the 3 nums using Math.max function and print the result  
		max = Math.max(num1, num2);
		max = Math.max(num3, max);
		
		System.out.println("the max is " + max);
		
		// find the smallest num using Math.min function from the 3 and print the result
		min = Math.min(num1, num2);
		min = Math.min(num3, min);
	
		System.out.println("the min is " + min);
		
		sc.close();
	}

}
