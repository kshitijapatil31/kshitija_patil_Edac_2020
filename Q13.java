import java.util.Scanner;
class Q13
{
  public static void main (String args[])
 {
   Scanner s=new Scanner (System.in);
   System.out.println("Enter three numbers:");
   int num1=s.nextInt();
   int num2=s.nextInt();
   int num3=s.nextInt();
   if(num1>num2 && num1>num3)
    {
      System.out.println("num1 is greater than num2and num3");
     }
     if(num2>num1 && num2>num3)
      {
        System.out.println("num2 is  greater than num1 and num3");
      }
      else
        {
           System.out.println("num3 is greater than num1 and num2");
        }
 
}
}