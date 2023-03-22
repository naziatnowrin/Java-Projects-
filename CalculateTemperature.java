import java.util.*;
public class CalculateTemperature
{
public static void main (String args[])
{

//Creating scanner keyboard 
  Scanner keyboard = new Scanner(System.in);
  
  //Asking for user input
 System.out.println("Enter temperatures for as many days as you would like"  
                      + " to calculate the average ");  
int temperature = keyboard.nextInt();
int [] number = new int[temperature];

//for loop to enter a number in an array 
for ( int i = 0; i < number.length; i++ )
{
System.out.println("Enter a number to be placed in an array: ");
number[i] = keyboard.nextInt();
}

//Calling method 
//double arrayAvg = arrayAvg(number);
System.out.println("The average is: " + arrayAvg(number));

}
//This method calculates the sum of numbers entered by the user
//and calculates the average. Then returns the average
public static double arrayAvg(int number[])
{
int sum = 0;
int count = 0;
//for loop that prints out the array of numbers and calculates the sum 
for (int i = 0; i < number.length; i++)
 {
      sum = sum + number[i];
      double avg = sum/number.length;
      
     if
        (number[i] > avg)
     {
        count++;
      } 
}

System.out.println("The temperature was above average for " + count + " days."); 
double avg = sum/number.length;
return avg;
}

}