//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class DigitAdder
{
	public static int go( int num )
	{
		int digit=0;
		int total=0;
		while(num>0)
			digit =num%10;
		num = num/10;
				total+= digit;
		return total;
		/*
		 * int go= 0;
		 
		
		while(num>0)	
			go += num%10;
			num/=10;
		
		return go;
		*/
	}
}