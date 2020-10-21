import java.util.Scanner;
class Q6
{
  public static void main(String args[])
 {
 float area ,cir;
 float pi=3.14f;
 Scanner x=new Scanner(System.in);
 System.out.print("Enter Radius of Circle:");
 float R=x.nextFloat();

 area=pi*R*R;
 cir=2*pi*R;
 System.out.println("Area of circle ="+area);
 System.out.println("circumference of circle ="+cir);
 }
}