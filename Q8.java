import java.util.Scanner;
class Q8
{
  public static void main(String args[])
 {
   float p,r,n;
   Scanner s=new Scanner(System.in);
   p=s.nextFloat();
   r=s.nextFloat();
   n=s.nextFloat();
   float si=p*r*n/100 ;
   System.out.println("simple Interest="+si);
}
}