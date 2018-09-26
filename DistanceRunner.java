//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		Distance test = new Distance();

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		int x1= xOne;
		int y1= yOne;
		int x2= xTwo;
		int y2= yTwo;
		Distance test1 = new Distance (x1, y1, x2, y2);
		test1.calcDistance();
		test1.print();
		//add test cases	
			
	}
}