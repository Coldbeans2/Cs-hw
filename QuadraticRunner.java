//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
  		
  		System.out.println("Enter #");
  		int a = keyboard.nextInt();
  		
  		System.out.println("Enter #");
  		int b = keyboard.nextInt();
  		
  		System.out.println("Enter #");
  		int c = keyboard.nextInt();
  		
  		Quadratic test = new Quadratic();
  		
  		test.setEquation(a,b,c);
  		test.calcRoots();
  		test.print();
		
	
	}
}