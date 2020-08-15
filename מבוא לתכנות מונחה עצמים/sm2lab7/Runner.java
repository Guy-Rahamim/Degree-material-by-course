package sm2lab7;

import customExceptions.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//this is in case do while loops will be requiered per field.
public class Runner
	{
		public static Scanner input = new Scanner(System.in);

		public static void main(String[] args)
			{
				int ingredientAmount = 0;

				// helper variable for managing the collection of data.
				boolean whileBoolean = true;
				
				//a do while loop that repeats until valid number of ingredients is entered.
				do
					{
						//try block for capturing exceptions thrown by scanner object.
						try
							{
								System.out.println(
										"Please enter the amount of salad ingredients." + "\nA valid amount is between 2 and 5.");
								ingredientAmount = input.nextInt();
								if (ingredientAmount < 2 || ingredientAmount > 5)
									throw new InvalidInputException("Invalid ingredient count. please try again!");
								whileBoolean = true;
							} 
						
						//catch and handle InvalidInputException
						catch (InvalidInputException e)
							{
								System.err.println(e.getMessage());
								whileBoolean = false;
							} 
						
						//catch and handle InputMismatchException
						catch (InputMismatchException d)
							{
								System.err.println("Please enter a number and not anything else.");
								whileBoolean = false;
							}
					}
				while (!whileBoolean);

				// initialize and Ingredient array with the chosen size.
				Ingredient[] salad = new Ingredient[ingredientAmount];

			for (int i = 0; i < salad.length; i++)
				{
								System.out.println("\nChoose ingredient number " +(i+1)+":" + "\nvegetable" + "\nspice"
										+ "\nor protein? ");

								switch (input.next())
									{
									case "vegetable": 
											{
										salad[i]=instantiateVegetableWithInput();
										whileBoolean = true;
										break;
									}

									case "spice": {
									
										salad[i]=instantiateSpiceWithInput();
										whileBoolean = true;
										break;
									}

									case "protein": {
									
										salad[i]=instantiateProteinWithInput();
										whileBoolean = true;
										break;
									}

									default: {
										System.out.println("Sorry, invalid option.");
										whileBoolean = false;
									}
									}

					}

				// checking for healthiness of the salad
				//if its not healthy, catches the unhealthy exception.
				try
					{
						checkHealthiness(salad);
						
						//call add methods of each ingredient.
						for (Ingredient ingredient : salad)
							{ ingredient.add();	}

						System.out.println();

						//call action method for each ingredient.
						for (Ingredient ingredient : salad)
							{	ingredient.action();	}
					}
				catch (UnhealthyException e)
					{ System.err.println(e.getMessage());	}
				
				input.close();
			}

		//function for checking if the salad has at lease 1 vegetable and 1 protein.
		//else it throws an UnhealthyException.
		public static boolean checkHealthiness(Ingredient[] salad) throws UnhealthyException
			{
				boolean vegetableFlag = false;
				boolean proteinFlag = false;
				for (int i = 0; i < salad.length || (!vegetableFlag && !proteinFlag); i++)
					{
						if (salad[i].getClass().getSimpleName().equals("Vegetable"))
							vegetableFlag = true;

						if (salad[i].getClass().getSimpleName().equals("Protein"))
							proteinFlag = true;
					}
				if (vegetableFlag && proteinFlag)
					return true;
				throw new UnhealthyException("this salad is not healthy and should not be made.");

			}
		//helper functions for instantiating objects. exceptions are handled
		//inside the functions so they do not throw exceptions.
		
		public static Vegetable instantiateVegetableWithInput()
		{
			String tempName="", tempUnitOfMeasure="";
			int tempAmount=0;
			boolean tempFoodBoolean=true;
			
			boolean whileBoolean=true;
			
			do
				{
				try
					{
						System.out.println("what vegetable would you like to add?");
						tempName = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid name.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);

			do
				{
				try
					{
						System.out.println("what is " + tempName + "s unit of measure?");
						tempUnitOfMeasure = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid unit of measure.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);
				
			do
				{
				try
					{
						System.out.println("how much " + tempName + " would you like to add?");
						tempAmount = input.nextInt();
						if (tempAmount < 1)
							throw new InvalidInputException();
						whileBoolean = true;
					}

				catch (InvalidInputException e)
					{
						System.err.println("amount cannot be smaller than 1. please try again.");
						whileBoolean = false;
					}

				catch (InputMismatchException d)
					{
						System.err.println("Please enter an amount as a number.");
						whileBoolean = false;
						input.next();
					}
				}
			while(!whileBoolean);
				
				System.out.println("is the " + tempName + " organic?");
				if (input.next().equalsIgnoreCase("yes"))
					tempFoodBoolean = true;
				else
					tempFoodBoolean = false;

				Vegetable vegetable = new Vegetable(tempName, tempUnitOfMeasure, tempAmount,
						tempFoodBoolean);
				return vegetable;
		}
	
		public static Spice instantiateSpiceWithInput()
		{
			String tempName="", tempUnitOfMeasure="";
			int tempAmount=0;
			boolean tempFoodBoolean=true;
			
			boolean whileBoolean=true;
			do
				{
				try
					{
						System.out.println("what spice would you like to add?");
						tempName = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid name.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);
			
			do
				{
				try
					{
						System.out.println("what is " + tempName + "s unit of measure?");
						tempUnitOfMeasure = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid unit of measure.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);
			
			do
				{	
				try
					{
						System.out.println("how much " + tempName + " would you like to add?");
						tempAmount = input.nextInt();
						if (tempAmount < 1)
							throw new InvalidInputException();
						whileBoolean=true;
					}

				catch (InvalidInputException e)
					{
						System.err.println("amount cannot be smaller than 1. please try again.");
						whileBoolean = false;
					}

				catch (InputMismatchException d)
					{
						System.err.println("Please enter an amount as a number.");
						whileBoolean = false;
						input.next();
					}
				}
			while(!whileBoolean);
				
				System.out.println("is the " + tempName + " spicy?");
				if (input.next().equalsIgnoreCase("yes"))
					tempFoodBoolean = true;
				else
					tempFoodBoolean = false;

				 Spice spice= new Spice(tempName, tempUnitOfMeasure, tempAmount,
						tempFoodBoolean);
				 
				 return spice;
		}

		public static Protein instantiateProteinWithInput()
		{
			String tempName="", tempUnitOfMeasure="";
			int tempAmount=0;
			boolean tempFoodBoolean=true;
			
			boolean whileBoolean=true;
			
			do
				{
				try
					{
						System.out.println("what protein would you like to add?");
						tempName = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid name.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);
			
			do
				{
				try
					{
						System.out.println("what is " + tempName + "s unit of measure?");
						tempUnitOfMeasure = input.next();
						whileBoolean=true;
					}

				catch (NullPointerException d)
					{
						System.err.println("Please enter a valid unit of measure.");
						whileBoolean = false;
					}
				}
			while(!whileBoolean);
			
			do
				{
				try
					{
						System.out.println("how much " + tempName + " would you like to add?");
						tempAmount = input.nextInt();
						if (tempAmount < 1)
							throw new InvalidInputException();
						whileBoolean=true;
					}

				catch (InvalidInputException e)
					{
						System.err.println("amount cannot be smaller than 1. please try again.");
						whileBoolean = false;
					}

				catch (InputMismatchException d)
					{
						System.err.println("Please enter an amount as a number.");
						whileBoolean = false;
						input.next();
					}
				}
			while(!whileBoolean);
			
				System.out.println("is the " + tempName + " a replacement protein?");
				if (input.next().equalsIgnoreCase("yes"))
					tempFoodBoolean = true;
				else
					tempFoodBoolean = false;

				Protein protein= new Protein(tempName, tempUnitOfMeasure, tempAmount,
						tempFoodBoolean);
				return protein;
		}
	}
