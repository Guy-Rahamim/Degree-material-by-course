//Dalya Wiliam & Guy Rahamim
public class Assignment10
	{
		public static void main(String[] args)
			{
			//------------------------Question 1-----------------------//
				System.out.println("Exe.1");
			String str1="I love programming. I love Java.";
			String sub1= "love";
			System.out.println("Example 1:\n " +"the string is: " + str1+"\nThe sub string is: "+ sub1 + "\nAnd the index is: "  +(searchForSub(str1,sub1)));
			System.out.println("\n");
			String str2="fast breakfast";
			String sub2= "fast";
			System.out.println("Example 2:\n " +"the string is: " + str2+"\nThe sub string is: "+ sub2 + "\nAnd the index is: "  +(searchForSub(str2,sub2)));
			
			
			//-----------------------------Question 2 -----------------------//
			//Example 1
			System.out.println("\n\nExe.2");
			String[] strArr1= {"Hello", "Hello Guy", "Oh, Hello Guy, how are you?"} ;
			System.out.println("Example 1:\nThe contents of the string array is: ");
			printStringArray(strArr1);
			System.out.println("\nThe answer is: "+checkForContSub(strArr1));
			
			//Example 2
			String[] strArr2= {"h", "he", "hel", "hell", "hello", "hello", "mello there"};
			System.out.println("\nExmple 2:\nThe content of the string array is: ");
			printStringArray(strArr2);
			System.out.println("\nThe answer is: " + checkForContSub(strArr2));
			
			//----------------------------Question 3------------------------//
			System.out.println("\n\nExe.3");
			
			//example 1
			String countedString = "Please count how many a's are present.";
			char charToCount = 'a';
			
			//example 2
			System.out.println("the string is: " +countedString + "\nThe character is: " +charToCount);
			System.out.println("and the answer is: " +countTheChar(countedString, charToCount));
			
			//---------------------------Question 4 -----------------------//
			System.out.println("\n\nExe.4");
			
			//example 1
			String stringToCheck1="madam";
			System.out.println("Example 1:\nThe string is: " + stringToCheck1);
			System.out.println("the function returns: " +classifyThePalindrom(stringToCheck1)+ "\n");
			
			//example 2
			String stringToCheck2="abba";
			System.out.println("Example 2:\nThe string is: " + stringToCheck2);
			System.out.println("the funtion returns: " +classifyThePalindrom(stringToCheck2)+ "\n");
			
			//example 3
			String stringToCheck3="hello";
			System.out.println("Example 3:\nThe string is: " + stringToCheck3);
			System.out.println("the function returns: " +classifyThePalindrom(stringToCheck3));
			}
			
		//-----------------------Functions----------------------//
		
		//-----------------------------Exe.1--------------------//
		//the function searches for a sub as a substring in str,
		//and returns the index of the first char of sub's last
		//appearence in str.
		public static int searchForSub(String str, String sub)
		{
			int index=-1;
			for (int i=str.length()-sub.length(); i>=0;i--)
				{
					if (sub.equals(str.substring(i, i+sub.length())))
						{
							
							return i;
						}
				}
			return index;
		}
		
		//-----------------------------Exe.2--------------------//
		//the function takes a string array and checks if each cell
		//of the array is a sub string of the next cell.
		public static boolean checkForContSub (String[] strArr)
		{
			for (int i=1; i<strArr.length ; i++)
				{
					if (!(searchSub(strArr[i],strArr[i-1])))
								{
									return false;
								}
				}
			return true;
		}
		
		//----------------------helper for Exe.2--------------------//
		//a helper function for question 2 that check if sub is a substring
		//of str.
		public static boolean searchSub(String str, String sub)
		{
			//boolean isSub=false;
			for (int i=0; i<=str.length()-sub.length();i++)
				{
					if (sub.equals(str.substring(i, i+sub.length())))
						{
						return true;
						}
				}
			return false;
		}
		
		//-----------------------------Exe.3--------------------//
		
		//a function that takes a string and a character and counts how many
		//times the character appears in the string.
		public static int countTheChar (String str, char charToCount)
		{
			int counter=0;
			for (int i=0; i<str.length();i++)
				{
					if (str.charAt(i)==charToCount)
						counter++;
				}
			return counter;
		}
		
		//-----------------------------Exe.4--------------------//
		//a function takes a string and checks if its a palindrom.
		//if it is, it checks what type of palindrom it is (odd or even numbered).
		public static int classifyThePalindrom(String str)
		{
			for (int i=0; i<str.length()/2; i++)
				{
					if (str.charAt(i)!=str.charAt(str.length()-1-i))
						return -1;
				}
			if (str.length()%2!=0)
				return 1;
			return 0;
		}
		
		//a helper function that prints 1 dimensional string arrays. 
		public static void printStringArray(String[] strArr)
		{
			for (int i = 0; i < strArr.length; i++)
				{
					System.out.print(strArr[i]+ "\t");
				}
		}
		
	}
