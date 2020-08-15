//Dalya Wiliam  & Guy Rahamim .
//Assignment 9


package lab5;

import java.util.Scanner; //importing the scanner library


public class Exe_9_asterix {

	public static void main(String[] args) {
		
		int num, i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		num = sc.nextInt();
		
		if (num < 0 || num > 20)
			num = 5;
		

			
		//a for loop that runs from 0 to num-1,
		//iterating on i.
		//outer loop separates the lines.
		for (i = 0; i<= num-1 ; i++) 
		{
			//a for loop that runs from 0 to num-1,
			//iterating on j.
			//inner loop prints stars and spaces in line.
			for(j=0 ; j<num-1 ; j++)
			{
				//if these conditions are met, print a star.
				if ( i == 0 || j == 0 || num - 1 == j || num - 1 == i )
					System.out.print("*");
				else System.out.print(" ");
				
				
			}
			
			System.out.println("");
		}
		
		
		sc.close();
	}

}
