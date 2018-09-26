//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	 String fv= ("a"+"A");
	 String sv = ("e" + "E");
	 String tv= ("i" + "I");
	 String fov = ("o"+"O");
	 String fiv =("u"+"U");
	 String first = a.substring(0,1);
	 String last = a.substring(a.length()-1);
	 
	 if ((first.equals(fv))||( first.equals(sv))||(first.equals(tv))||(first.equals( fov))||(first.equals(fiv)))

		return "yes"; 
	// else if ((last.equals(iv))||(last==sv)||(last=tv)||(last==fov)||(last==fiv));
	return last;
	

	
	}
}