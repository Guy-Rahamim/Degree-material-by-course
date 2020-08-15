//Dalya William & Guy Rahamim
//Home assignment 6.

import java.util.Scanner;
public class Functioning
	{
		public static Scanner input = new Scanner(System.in);
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			boolean quit=false;
			double radius=0;
			int num1=0, num2=0, num3=0,num4=0;

			
			
			while (!quit)
				{
					
					switch (getMenuChoice())
					{
						case 1:	// case for calling the "squares" function.
						{
							//ask users for input.
							System.out.println("Please enter 3 numbers: ");
							num1=input.nextInt();
							num2=input.nextInt();
							num3=input.nextInt();
				 	
							//function call
							System.out.println("The answer is: " + squares(num1,num2,num3) + "\n");
							break;
						}
				
						case 2: //case for calling the "checkRectangle" function.
						{			
							//asking the user for input.
							System.out.println("Please enter numbers for 4 sides of a rectangle:");
							num1=input.nextInt();
							num2=input.nextInt();
							num3=input.nextInt();
							num4=input.nextInt();
					
							//function call.
							System.out.println("Can these be 4 adjacent sides of a rectangle?\n"
							+ "The answer is " + checkRectangle(num1,num2,num3,num4) +"\n");
							break;
						}
				
						case 3: //case for calling the "circleSum" function.
						{
							//asking the users for input.
							System.out.println("Please enter a circle's radius:");
							radius=input.nextDouble();
					
							//function call
							System.out.println(circleSum(radius) + "\n");
							break;
						}
						
						case 4: // case for calling the "factAVG" function.
						{
							System.out.println("Please enter 3 numbers to be factored and averged:");
							num1=input.nextInt();
							num2=input.nextInt();
							num3=input.nextInt();
							
							//function call.
							System.out.println("The averaged value is: " + factAVG(num1, num2, num3) +"\n");
							break;
						}
						
						case 5: //case for leaving the program.
						{
							System.out.println("We are at an end. Thank you for participating!");
							quit=true;
						}
					}//end switch
			
				}//end while
				input.close();
			}//end main
		
		//a function that takes 3 numbers and check if they are consecutive powers of 2.
			public static boolean squares (int num1,int num2,int num3) // Ex.1
			{

				return (Math.pow(num1, 2)==num2?(Math.pow(num2, 2)==num3?true:false):false);
			}
		
			
			//a function that takes 4 numbers and checks if they can be 4 sides of a rectangle.
			public static boolean checkRectangle(int side1, int side2, int side3, int side4) //Ex.2
				{
					//if all 4 numbers are positive
					if ((side1>0 && side2>0 && side3>0 &&side4 > 0) && ((side1==side3) && (side2==side4)))
					{
							return true;
					}
					return false;
				}
		
		
		//function that takes a radius and computes the circle's circumference + area.
		public static double circleSum (double radius) //Ex.3
		{
			//returns the circles circumference + area for the given radius.
			System.out.print("the circle's circumference + area, given radius " + radius + " is: ");
			return (2*Math.PI*radius + Math.PI*radius*radius);
		}
		
		
		
		public static double factAVG(int num1, int num2, int num3) //Ex.4
		{
			int i;
			double factorialsum1=1,
					factorialsum2=1,
					factorialsum3=1,
					numberOfDivisors=3;

			for (i=1;i<=num1;i++)
				factorialsum1*=i;
			
			for (i=1;i<=num2;i++)
				factorialsum2*=i;
			
			for (i=1;i<=num3;i++)
				factorialsum3*=i;
			
			return ((factorialsum1+factorialsum2+factorialsum3)/numberOfDivisors);
		}
		
		//function that prints the options and takes the choice from the user.
		public static int getMenuChoice() //Ex.5
		{
			int menuChoice;
			//prints choices.
			System.out.println("Please choose one of the following:\n" +
					"1.Check if each number of 3 given are squares in sequence.\n"
					+ "2.Check if 4 given numbers can be 4 sides of a rectangle. \n"
					+"3.Calculate the circumference plus the area of a circle given its radius. \n"
					+"4.Calculate the average of 3 given numbers' factorial values.\n"
					+"5.Exit the program.");
			
			//take the users selected choice.
			menuChoice=input.nextInt();
			
			//if the users selection is valid (between 1 and 5, inclusive)
			//return the choice.
			//else, print "bad input" and then return the the choice.
			if (menuChoice>=1 && menuChoice<=5)
				return menuChoice;
			else
				System.out.println(menuChoice);
			return menuChoice;
		}
	}//end class
