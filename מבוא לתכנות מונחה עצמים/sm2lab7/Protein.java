package sm2lab7;

import customExceptions.InvalidInputException;

public class Protein extends Ingredient
	{

		protected int amount;
		protected boolean isreplacement;
		
		//default constructor
		public Protein()
		{
			super();
			setAmount(1);
			setIsReplacement(true);
		}
		
		///parametric constructor, might throw null pointer exception or invalid input exception.
		public Protein(String name, String unitOfMeasure, int amount, boolean isreplacement) throws NullPointerException, InvalidInputException
		{
			super(name,unitOfMeasure);
			setAmount(amount);
			setIsReplacement(isreplacement);
		}

		public int getAmount()
			{
				return amount;
			}

		//might throw invalid input exception
		protected void setAmount(int amount) throws InvalidInputException
			{
				if (amount<=0)
					{
						throw new InvalidInputException();
					}
				else
				this.amount = amount;
			}

		public boolean getIsReplacement()
			{
				return isreplacement;
			}

		protected void setIsReplacement(boolean isreplacement)
			{
				this.isreplacement = isreplacement;
			}
		
		@Override
		public String toString()
		{
			
			return super.toString() 
					+ ", amount: " + getAmount()
					+ ", is this replacement? " +getIsReplacement(); 
		}

		//compares 2 objects of type Protein.
		@Override
		public boolean equals(Object obj)
		{
			if (this==obj)
				return true;
			
			if (!super.equals(obj))
				return false;
			
			//casting to an object of type Protein
			Protein other = (Protein) obj;
			
			//checking individual fields
			return (this.getAmount()==other.getAmount()
					&&this.getIsReplacement()==other.getIsReplacement());
		}
		
		public void action()
		{
			System.out.println("Cook the " +getName()+"s");
		}
		
		public void add()
		{
			String replacementString=" ";
			if (getIsReplacement())
				replacementString=" replacement";
			System.out.println(getAmount()+ " " +getUnitOfMeasure()+   " of " + getName()+ replacementString);
		}
	}
