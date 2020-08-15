package customExceptions;

//throw this exception when values that are  logically invalid are entered
public class InvalidInputException extends RuntimeException
	{
		public InvalidInputException()
		{
			super();
		}
		
		
		public InvalidInputException(String message)
		{
			super(message);
		}
	}
