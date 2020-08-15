//Dalya Wiliam  & Guy Rahamim .
//Assignment 7

package lab5;
import java.util.Scanner; //importing the scanner library

public class Exe_7_guessingGame {

	public static void main(String[] args) {
	
		
		//initializing variables
		int userGuess, maxTries = 10, i, randomNum;
		double num;
		boolean succeeded=false;
		
		Scanner sc = new Scanner(System.in);		
		num =Math.random();
		randomNum = (int) (num * 100);
		
		
		// for loop that takes a user guess and  compares in with the chosen numbers
		for (i=0; i <= maxTries-1 && succeeded==false ; i++)
		{
		
			System.out.println("Guess the number between 1-100: ");
			userGuess = sc.nextInt();
			
			
			// if the number is bigger / smaller, print bigger/smaller
			if ( userGuess > randomNum)	{	
				System.out.println("Your number is bigger than random num");
			}
			else if (userGuess < randomNum) {
				System.out.println("Your number is smaller than random num");
			}
			else if (userGuess == randomNum) {
				System.out.println("You win! :)");
				succeeded=true;

			}
				if ( i == maxTries -1) {
					succeeded=false;
					System.out.println("Game over!"); 
			}
		}
		
		sc.close();
	}
}
