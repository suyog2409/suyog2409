import java.util.Scanner;
interface operation
{
final static double PI=3.142;
double area();
double volume();
}
class circle implements operation
{
int radi;
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("\n enter the radius: ");
radi=sc.nextInt();
}
public double area()
{
return PI*radi*radi;
}
public double volume()
{
return 4/3*PI*radi*radi*radi;
}
}
public class Q2
{
public static void main(String args[])
{
circle br= new circle();
br.accept();
System.out.println("\n area: "+br.area());
System.out.println("\n volume: "+br.volume());
}
}

