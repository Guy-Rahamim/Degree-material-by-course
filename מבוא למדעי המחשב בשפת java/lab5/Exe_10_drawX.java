//Dalya Wiliam  & Guy Rahamim .
//Assignment 10


package lab5;
import java.util.Scanner; //importing the scanner library



public class Exe_10_drawX {

	public static void main(String[] args) {

		
		//initializing variable
		int num, i, j;
		
		
		//taking in user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num and i will draw an x: ");
		num = sc.nextInt();
		
		//if the number is even or not between 2 and 20,
		//reassign num to 5.
		if (num < 0 || num > 20 || num % 2 == 0)
		num = 5;
		
		
			
		for (i = 0; i< num ; i++) 
		{
			for(j=0 ; j < num ; j++)
			{
				if (j == i || j == num - 1 - i)
					System.out.print("X");
				
				
				else System.out.print(" ");
				
			}		
			
			System.out.println("");

			
		}
		
		sc.close();
		
	}

}
