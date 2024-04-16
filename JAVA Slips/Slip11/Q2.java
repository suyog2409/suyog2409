import java.util.Scanner;
abstract class shape
{
abstract double area();
abstract double volume();
}
class sphere extends shape
{
int radius;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the radius: ");
radius= sc.nextInt();
}
double area()
{
return 4*3.14*radius*radius;
}
double volume()
{
return (4/3)*3.14*radius*radius*radius;
}
}
public class Q2
{
public static void main(String args[])
{
sphere br=new sphere();
br.accept();
System.out.println("\n The area is: "+br.area());
System.out.println("\n The volume is: "+br.volume());
}
}

