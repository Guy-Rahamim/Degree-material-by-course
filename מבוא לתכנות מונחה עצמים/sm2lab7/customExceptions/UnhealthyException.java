package customExceptions;

public class UnhealthyException extends RuntimeException
	{
		public UnhealthyException()
		{
			super();
		}
		
		public UnhealthyException(String message)
		{
			super(message);
		}
	}
