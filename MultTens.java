//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		String cat ="";
		int stop= 10*x;
		for (int count=0 ; count<=stop;count=count+10)
			System.out.print(count);
		return cat;
	}
}