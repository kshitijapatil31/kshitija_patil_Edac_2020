import java.util.Scanner;
class Q12
{
  public static void main(String args[])
 {
   float hra, da, gs;
   Scanner s=new Scanner(System.in);
    System.out.println("Enter the Salary:");
    float basic=s.nextFloat();
   if(basic<1000)
   {
    hra=basic*10/100;
    da=basic*90/100;
   }
   else 
  {
   hra=2000;
   da=basic*98/100;
  }
   gs=basic + da + hra;

   System.out.println(hra);
   System.out.println(da);
   System.out.println(gs);
}
}