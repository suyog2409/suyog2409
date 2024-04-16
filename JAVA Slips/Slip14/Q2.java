import java.util.Scanner;
interface operation
{
double area();
double volume();
final static double PI=3.142;
}
class cylinder implements operation
{
int radi,height;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the radi and height");
radi=sc.nextInt();
height=sc.nextInt();
}
public double area()
{
return 2*PI*radi*height*2*PI*radi*radi ;
}
public double volume()
{
return PI*radi*radi*height ;
}
}
public class Q2
{
public static void main(String args[])
{
cylinder br= new cylinder();
br.accept();
System.out.println("\n area: "+br.area());
System.out.println("\n volume: "+br.volume());
}
}

