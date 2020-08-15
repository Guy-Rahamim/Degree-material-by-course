//Dalya Wiliam  & Guy Rahamim .
//Assignment 6

package lab5;

import java.util.Scanner; //importing the scanner library

public class Exe_6_digitMultiplier {

	public static void main(String[] args) {
		
		
		//initializing variables
		int num, digit,  tempNum, digitMul=1;

		
		
		//taking in user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		num = sc.nextInt();
		
		
		//using a temporary variable tempNum so the
		//original value of num won't be overwritten
		tempNum=num;
		
		
		// make sure  the number is positive
		if (tempNum < 0 )
			tempNum *= -1;
		
		else if (tempNum == 0)
			digitMul = 0;
		
		//print the multiply the digits of the number
		while (tempNum > 0)
		{
		  digit = tempNum % 10;
		  digitMul *= digit;
		  tempNum = tempNum / 10;
		}
		
		System.out.println(digitMul);
		
		sc.close();
		
		}

	}


