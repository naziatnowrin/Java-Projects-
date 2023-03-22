import java.util.*;
import java.util.Arrays;
public class ArraySorting
{
 public static void main(String [] args)
 {
   int [] data = new int[5];
   
     //Create Scanner Keyboard 
   Scanner keyboard = new Scanner(System.in);
     
   for(int i = 0; i < 5; i++)
   {
   System.out.println("Gimme 5 numbers");
   int nums = keyboard.nextInt();
   int [] newNums = new int [nums];
   }
   
//callArray();
  // System.out.println("Array unsorted: " + Arrays.toString()); 
  // Arrays.sort();
  // System.out.println("Array sorted" + Arrays.toString());
   
   
 }
 public static void callArray(int arr[])
 {
   System.out.println("The original array is: ");
   for(int i = 0; i < arr.length; i++)
   {
 System.out.println(arr[i] + "");
 }
   System.out.println()
  
  
}