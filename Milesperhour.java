import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Milesperhour
{
 private int distance, hours, minutes;
 private double mph;
 public void MilesPerHour()
 {
  setNums(0, 0, 0);
  mph=0.0;
 }
 public void MilesPerHour(int dist, int hrs, int mins)
 {
  
  
 }
 public void setNums(int dist, int hrs, int mins)
 {
   dist =  distance;
   hrs = hours ;
   mins = minutes ;
 }
 public void calcMPH()
 {
  double time = minutes/60 + hours;
  mph = distance / time;
 }
 public void print()
 {
  System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes " + " = " + mph );
 }
 
 //create a print or toString or both
 
 public String toString()
 {
  return "";
 }
}


