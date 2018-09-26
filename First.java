//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public static String go( String a )
	{
	   String word =a.substring(0,1);
	   int firstlet = a.indexOf(word);
	   int secondlet = a.lastIndexOf(word);
	   
	if (firstlet== secondlet){
		System.out.println("no");
	}
	else 
		   System.out.println("yes");
	   
	   
		
	return "";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/