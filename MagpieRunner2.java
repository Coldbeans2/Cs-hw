import java.util.Scanner;


public class MagpieRunner2
{

	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
			System.out.println(" hello i talk a lot but not as much as my sister who talks a lot");
			System.out.println("i dont talk that much");
		}
	}

}