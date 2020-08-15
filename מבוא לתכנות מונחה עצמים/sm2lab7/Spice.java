package sm2lab7;

import customExceptions.InvalidInputException;

public class Spice extends Ingredient
	{	
		protected int amount;
		protected boolean isSpicy;
		
		//defualt constructor
		public Spice()
		{
			super();
			setAmount(1);
			setIsSpicy(true);
		}
		
		//parametric constructor, might throwa null pointer exception or an invalid input exception.
		public Spice(String name, String unitOfMeasure, int amount, boolean isSpicy) throws NullPointerException, InvalidInputException
		{
			super(name,unitOfMeasure);
			setAmount(amount);
			setIsSpicy(isSpicy);
		}

		public int getAmount()
			{
				return amount;
			}

		//setAmount might throw invalid input exception.
		protected void setAmount(int amount) throws InvalidInputException
			{
				if (amount<=0)
					{
						throw new InvalidInputException();
					}
				else
				this.amount = amount;
			}
		
		public boolean getIsSpicy()
			{
				return isSpicy;
			}

		protected void setIsSpicy(boolean isSpicy)
			{
				this.isSpicy = isSpicy;
			}
		
		//compares 2 objects of type Spice.
		@Override
		public String toString()
		{
			
			return super.toString() 
					+ ", amount: " + getAmount()
					+ ", is this Spicy? " +getIsSpicy(); 
		}
		
		@Override
		public boolean equals(Object obj)
		{
			if (this==obj)
				return true;
			
			if (!super.equals(obj))
				return false;
			
			//casting to an object of type Vegetable
			Spice other = (Spice) obj;
			
			//checking individual fields
			return (this.getAmount()==other.getAmount()
					&&this.getIsSpicy()==other.getIsSpicy());
		}
		
		public void action()
		{
			System.out.println("Add the " +getName()+"");
		}
		
		public void add()
		{
			String SpicyString=" ";
			if (getIsSpicy())
				SpicyString=" Spicy";
			System.out.println(getAmount() + " " + getUnitOfMeasure()+ " of" + SpicyString+ " " + getName());
		}
	}
