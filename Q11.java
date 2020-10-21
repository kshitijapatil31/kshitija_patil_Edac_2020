class Q11
{
public static void main(String args[])
{
 double a=20.2d;
 double b=30.3d;
 System.out.println("Before swap:"+a+" "+b);
  a=a+b;
  b=a-b;
  a=a-b;
 System.out.println("After swap:"+a+" "+b);
return ;
}
}