import java.util.Scanner;
class Q13b
{
  public static void main (String args[])
 {
   int num4;
   Scanner s=new Scanner (System.in);
   System.out.println("Enter three numbers:");
   int num1=s.nextInt();
   int num2=s.nextInt();
   int num3=s.nextInt();
   num4=num3 > (num1 > num2 ? num1 : num2) ? num3 :((num1 > num2) ? num1 : num2);
        {
           System.out.println(num4);
        }
 
}
}