public class findHighest 
{
public static void main (String args[])
{
  int [] data = {8, 11, 3, 6};
  int highest = data[0];
  
  for(int i = 0; i < data.length; i++)
  {
     
    if(data[i] > highest)
      highest = data[i];
  
  
  }

 System.out.println("the highest is " + highest );


}




}