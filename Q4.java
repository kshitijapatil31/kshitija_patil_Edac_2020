import java.util.Scanner;
class Q4
{
  public static void main(String args[])
  { 
    byte z;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value;");
    byte x=sc.nextByte();
    byte y=sc.nextByte();
    z=(byte)(x+y);
    System.out.println("Sum of byte variable:"+z);

  }


}