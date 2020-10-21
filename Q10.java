import java.util.Scanner;
class Q10
{
 public static void main(String args[])
{
  double c;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the temperature:");
  double f=s.nextDouble();
  c = 5*(f-32)/9 ;
  System.out.println("C="+c);

}
}