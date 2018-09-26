//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0,0,0);
		rootOne = 0.0;
		rootTwo = 0.0;
		}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		
		quadA = a;
		quadB = b;
		quadC = c;
		
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		setEquation(a, b, c);
		
 	}

	public void calcRoots( )
	{
		int quadB = b;
		int quadA =a;
		int quadC = c;
		rootOne = (-1*(quadB) + Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
		rootTwo = (-1*(quadB) - Math.sqrt((quadB*quadB) - ((4*quadA)*quadC))) / (2*quadA);
	}

    public void print()
    {
    	System.out.println( rootOne);
    	System.out.println (rootTwo);
    }
    
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}