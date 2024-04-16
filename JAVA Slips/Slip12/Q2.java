import java.util.Scanner;
abstract class shape
{
abstract double area();
abstract double volume();
}
class cylinder extends shape
{
int radi,height;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the radius: ");
radi=sc.nextInt();
System.out.println("\n enter the height: ");
height=sc.nextInt();
}
double area()
{
return 2*3.14*radi*radi*height;
}
double volume()
{
return 2*3.14*radi*height + 2*3.14*radi*radi;
}
}
public class Q2
{
public static void main(String args[])
{
cylinder br=new cylinder();
br.accept();
System.out.println("\n The area: "+br.area());
System.out.println("\n The volume: "+br.volume());
}
}

