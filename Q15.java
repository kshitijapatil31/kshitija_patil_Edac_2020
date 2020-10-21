import java.util.Scanner;
class Q15
{
    public static void main(String args[])
{
String ch;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Gender(male/female):");
 char ch=sc.next().charAt(0);
 System.out.println("Enter age:");
 int age=sc.nextInt();
switch(ch)
{
case "m":
 if((age >= 21)&&(age<40)){
System.out.println("the person is eligible for marriage");
}
else{
System.out.println("the person is not eligible for marriage");
}
case "f" :

 if((age >= 18)&&(age<35))
{
System.out.println("the person is eligible for marriage");
}
else{
System.out.println("the person is not eligible for marriage");
}

}
}