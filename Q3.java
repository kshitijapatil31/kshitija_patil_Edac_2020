import java.util.Scanner;
class Q3
{
  public static void main(String args[])
  {
   int x;
   double y,z;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the values:");
   x=sc.nextInt();
   System.out.println("Enter the values of o and k:");
   boolean o=sc.nextBoolean();
   boolean k=sc.nextBoolean();

   y=Math.pow(x,2)+3*x-7;
   System.out.println(y);
   
    y=x++ + ++x;
   System.out.println( x + y );

   z=x++ - --y - --x + x++;
   System.out.println(x + y + z);
   
   boolean m= (o&&k)||!(o||k);
   System.out.println(m);


  }
}