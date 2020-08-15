package sm2lab7;
import customExceptions.InvalidInputException;

public class Vegetable extends Ingredient
	{
		protected int amount;
		protected boolean isOrganic;
		
		//default constructor
		public Vegetable()
		{
			super();
			setAmount(1);
			setIsOrganic(true);
		}
		
		//parmetric constructor, might throw a null pointer exception.
		public Vegetable(String name, String unitOfMeasure, int amount, boolean isOrganic) throws NullPointerException, InvalidInputException
		{
			super(name,unitOfMeasure);
			setAmount(amount);
			setIsOrganic(isOrganic);
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

		public boolean getIsOrganic()
			{
				return isOrganic;
			}

		protected void setIsOrganic(boolean isOrganic)
			{
				this.isOrganic = isOrganic;
			}
		
		@Override
		public String toString()
		{
			
			return super.toString() 
					+ ", amount: " + getAmount()
					+ ", is this organic? " +getIsOrganic(); 
		}
		
		//compares 2 objects of type Vegetable.
		@Override
		public boolean equals(Object obj)
		{
			if (this==obj)
				return true;
			
			if (!super.equals(obj))
				return false;
			
			//casting to an object of type Vegetable
			Vegetable other = (Vegetable) obj;
			
			//checking individual fields
			return (this.getAmount()==other.getAmount()
					&&this.getIsOrganic()==other.getIsOrganic());
		}
		
		public void action()
		{
			System.out.println("Chop the " +getName()+"s");
		}
		
		public void add()
		{
			String organicString=" ";
			if (getIsOrganic())
				organicString=" organic";
			System.out.println(getAmount() + " " + getUnitOfMeasure() + " of " + organicString+ " " + getName());
		}
	}
