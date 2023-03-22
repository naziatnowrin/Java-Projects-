public class aboveAvg
{
public static void main (String [] args)
{
  int [] nums = { 2, 4, 6, 8, };
  
  int sum = 0;
int count = 0;
//for loop that prints out the array of numbers and calculates the sum 
for (int i = 0; i < nums.length; i++)
 {
      sum = sum + nums[i];
      double avg = sum/nums.length;
      
     if
        (nums[i] > avg)
     {
        count++;
      } 


}
System.out.println("The average is :" + avg);
System.out.println("Above average is : " + count);

}
}





