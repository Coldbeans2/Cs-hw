
	import java.util.Scanner; 
	import static java.lang.System.*;
	import static java.lang.Math.*;
	public class Mph
	{
	 public static void main( String[] args )
	 {
	  Scanner keyboard = new Scanner(in);
	  out.print("Enter the distance :: ");
	  int dist = keyboard.nextInt();
	  out.print("Enter the hours :: ");
	  int hrs = keyboard.nextInt();
	  out.print("Enter the minutes :: ");
	  int mins = keyboard.nextInt();
	  Milesperhour test = new Milesperhour();
	  test.setNums(dist,hrs,mins);
	  test.calcMPH();
	  test.print();
	  
	  //add more test cases
	  
	  
	 }
	}


