//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -  

public class NumChecker
{
	public static int check( int x )
	
	{
		int num1= x%5;
		int num2 = x%4;
		int num3 =x%3;
		
		
		if (num1==0)
			return 1; 
		else if (num2== 0)
				return 2;
		else if (num3==0)
					return 3;
		else
		return 4;
	
	}
}
