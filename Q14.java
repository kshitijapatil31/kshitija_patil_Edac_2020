import java.util.Scanner;
class Q14
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year:");
int year =sc.nextInt();
if ( year%4  == 0 )  
{
System.out.println("The year is leap year");
}
else
if( (year%400 == 0) || (year%100 != 0) ) 
{
System.out.println("The year is not leap year");
}
else
{
System.out.println("The year is not leap year");
}
}
}