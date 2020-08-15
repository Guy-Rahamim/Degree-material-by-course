package sm2lab7;

public abstract class Ingredient
	{
		protected String name;
		protected String unitOfMeasure;
		
		//default constructor.
		public Ingredient()
		{
			setName("ingredient!");
			setUnitOfMeasure("Appropriate unit of measure");
		}
		
		//parametric constructor, might throw a null pointer exception.
		public Ingredient(String name, String unitOfMeasure) throws NullPointerException
		{
			setName(name);
			setUnitOfMeasure(unitOfMeasure);
		}

		public String getName()
			{
				return name;
			}

		//setName might throw null pointer exception.
		protected void setName(String name) throws NullPointerException
			{
				if (name==null)
					throw new NullPointerException();
				else
				this.name = name;
			}

		public String getUnitOfMeasure()
			{
				return unitOfMeasure;
			}

		//setUnitOfMeasure might throw a null pointer exception.
		protected void setUnitOfMeasure(String unitOfMeasure) throws NullPointerException
			{
				if (unitOfMeasure==null)
					throw new NullPointerException();
				this.unitOfMeasure = unitOfMeasure;
			}
	
		@Override
		public String toString()
		{
			return "Ingredient name: " + getName()+ ", unit of measure: " + getUnitOfMeasure();
		}
		
		//equals compares 2 objects of type ingredient.
		@Override
		public boolean equals(Object obj)
		{
			if (obj==null)
				return false;
			
			if (this==obj)
				return true;
			
			if (this.getClass()!=obj.getClass())
				return false;
			
			//casting to an object of type Ingredient
			Ingredient other = (Ingredient) obj;
			
			return (this.getName().equals(other.getName())
					&&this.getUnitOfMeasure().equals(other.getUnitOfMeasure()));
		}
	
		public abstract void add();
		
		public abstract void action();
			
	}
