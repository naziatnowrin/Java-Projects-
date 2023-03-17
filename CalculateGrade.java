import java.util.*;
public class CalculateGrade
{
public static void main (String [] args)
{
//Declaring Variables
  double testScore1;
  double testScore2;
  double testScore3;
  double average;
  Scanner keyboard = new Scanner(System.in);
  char grade;
  
  //Gathering user input 
  System.out.println(" Enter first test score :");
  testScore1 = keyboard.nextDouble();
  
  System.out.println(" Enter second test score :");
  testScore2 = keyboard.nextDouble();
  
  System.out.println(" Enter third test score :");
  testScore3 = keyboard.nextDouble();
  
average = (testScore1 + testScore2 + testScore3) / 3;
average = Math.round(average);


 if(average >= 90 && average <= 100)
  grade = 'A';

else if(average >= 80 && average <= 89)
  grade = 'B';

else if(average >= 70 && average <= 79)
  grade = 'C';

else if (average >= 60 && average <= 69 )
  grade = 'D';

else 
grade = 'F';

System.out.println(" Grade for average score is: " + grade );
}

}
  