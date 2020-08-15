//Dalya Wiliam  & Guy Rahamim .
//Assignment 4


package lab5;

import java.util.Scanner; //importing the scanner library

public class Exe4_dividBy5 {

	public static void main(String[] args) {
		
		
		
		//initializing variables
		int num = 0; int count = 0; int i;
					
		Scanner userInput = new Scanner(System.in);
		
		
		for (i=0; i <= 4; i++)
		{
			System.out.println("Enter a num");
			num = userInput.nextInt();
			
			
			// if the  number  divides by 5 count increased by 1.
			// if  count becomes 5 print "perfect five"
			// if the number has not divides by 5 print "bad value"
			
			
			if (num % 5 != 1)
			{
				count++;
			if(count == 5)			
			System.out.println("perfect five");
			}
			else
			{
				
				System.out.println("bad value");
				i = 7;				// to get out from the loop
			}
		}
		
		userInput.close();

	}
}