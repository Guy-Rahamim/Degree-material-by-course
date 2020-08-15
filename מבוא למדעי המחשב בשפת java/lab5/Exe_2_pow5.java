//Dalya Wiliam  & Guy Rahamim .
//Assignment 2

package lab5;

import java.util.Scanner;


	public class Exe_2_pow5 {
		public static void main(String[] args) {
			
			//initializing variables
			int num ;
			int res =0;
			int times = 5;
			
			//taking in user input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  a num: ");
			num = sc.nextInt();
			
			
			
			//calculating power of num to times.
			res = num;
			int i;
			for ( i=0 ; i < times -1 ; i++)
			{
				res = (res * num);
			}
			System.out.print(res);

			
			sc.close();

	}	

}
