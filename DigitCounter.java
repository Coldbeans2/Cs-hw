//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
   public static int go( int number )
	{
	   number = 234; 
		int go = 0;
		while( number > 0 )
		{
			number = number%10;
			go = go + 1;
			
	   

	}
		return go;
}
}