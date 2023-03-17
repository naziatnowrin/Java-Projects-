import java.util.*;
public class CalculateOrganismPopulation
{
public static void main (String [] args)
{
//Declaring variables
 double organisms =0;
 double organismNum =0;
 double populationIncrease;
 double multiply;
 double increase = 0;
 double percentage = 0;
 double population = 0;
 Scanner keyboard = new Scanner(System.in);

 
 //Gathering starting number of organisms
 System.out.print("Enter the starting number of organisms ");
 organismNum = keyboard.nextInt();

  //Gathering starting number of organism
 System.out.print("Enter the average daily percentage the population increases ");
 populationIncrease = keyboard.nextInt();
 
   //Gathering the number of days they will multiply
 System.out.print("Enter the percentage of number of days they will multiply ");
 multiply = keyboard.nextInt();
 
 
//While Loop for organism
    while ( organismNum < 2)
   {
   System.out.println("Enter more than 2 organisms: ");
   organismNum = keyboard.nextDouble();
   }
    
    //While Loop for population increase
    while ( populationIncrease < 0)
   {
   System.out.println("Error. Enter a positive number for average daily population increase ");
   populationIncrease = keyboard.nextDouble();
   }
   
 // While loop for days it multiplies 
    while ( multiply < 1)
   {
   System.out.println("Error. Enter more than 1 day. ");
   multiply = keyboard.nextDouble();
   }
   
   
 
 System.out.println(" Day                      Organisms");
 System.out.println("------------------------------------");

//For loop
  
for( organismNum = 1; organismNum <= multiply; organismNum++)
  if(multiply > 1)
{
  population = ( organismNum * (populationIncrease / 100));

  
 System.out.println(organismNum + "                        " + population);
}
  

 
 
 
 
}



}