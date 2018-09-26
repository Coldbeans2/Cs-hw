//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class AB
{
	public static boolean check( String s, String a, String b)
	{
		boolean tf= true;
		
		String A = a;
		String B = b;
		String two = A+B;
		String whole= s.substring(1,(s.length()-1));
		
		if (whole.contains(two)){
		return tf;
		
		
		
	}
		return false;
}
	
}