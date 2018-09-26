//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo= 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public void calcDistance()
	{
		
		 int x1= xOne;
		int y1= yOne;
		int x2= xTwo;
		int y2= yTwo;
		distance = (Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1)));
		
		
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println( "distance =" );
		System.out.printf("%.3f\t",getDistance());
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}