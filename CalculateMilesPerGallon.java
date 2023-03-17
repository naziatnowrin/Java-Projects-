import java.util.*;
public class CalculateMilesPerGallon
{
  
  public static void main (String [] args)
{
   // Declare variable and objects 
  double miles, gallons, mpg; 
  Scanner keyboard = new Scanner(System.in);
  
//gathering user inout
  System.out.println("How many miles: ");
  miles = keyboard.nextDouble();
  
  System.out.println("How many gallons did you consume: ");
  gallons = keyboard.nextDouble();
  
  //algorim
  mpg = miles/gallons; 
  
//output 
  System.out.println("Your MPG is: " + mpg);
}
  
}

