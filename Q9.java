import java.util.Scanner;
class Q9
{
public static void main(String args[])
{
int days,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the days:");
days=s.nextInt();

int year=n/365;
n=n%365;
System.out.println("Year="+year);
int month=days/30;
int week=n/7;
n=n%7;
day=n;
System.out.println("Month="+month);
System.out.println("Week="+week);
System.out.println("Days="+day);
}
}