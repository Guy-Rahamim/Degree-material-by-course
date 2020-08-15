package lab5;

import java.util.Scanner;
public class Exe_8_Reverse
	{
		public static void main(String[] args)
			{
				//initializing variables.
				Scanner input = new Scanner (System.in);
				int num, tempNum, minBoundry=100;
				
				//a do while loop that takes input from the user,
				//and prints bad input if the num is not a 3 digit num.
				do 
					{	
						System.out.println("Please enter a positive 3 digit num: ");
						num=input.nextInt();
					
						if ((num < minBoundry))
							{
							System.out.println("Bad input!");
							}
						}
				while (num<minBoundry);
				
				//assign the value of num to tempNum so the original value
				//won't be overwritten.
				tempNum=num;

				//as long as tempNum is bigger than 0,
				//print the last digit of tempNum,
				//and then remove said digit from tempNum.
				while (tempNum > 0 )
					{
						System.out.print(tempNum%10);
						tempNum/=10;
					}
				input.close();
			}
	}
