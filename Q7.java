import java.util.Scanner;
class Q7
{
 
public static void main(String args[])
{
 
 Scanner ok=new Scanner(System.in);
 System.out.println("Enter the marks:");
 int eng=ok.nextInt();
 int math=ok.nextInt();
 int os=ok.nextInt();
 int java=ok.nextInt();
 int datastruc=ok.nextInt();
 float sum=eng+math+os+java+datastruc;
 float percentage = (sum/500)*100;

  System.out.println("percentage marks="+percentage+"%");
}
}