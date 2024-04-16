import java.util.Scanner;
class point
{
int x,y;
point()
{
x=0;
y=0;
}
point(int x, int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println("\n Coordinates \nx:"+x+"\ny:"+y);
}
}
class colorpoint extends point
{
String color;
colorpoint()
{
super();
color=" ";
}
colorpoint(int x,int y,String color)
{
super(x,y);
this.color=color;
}
void display()
{
super.display();
System.out.println("\n color: "+color);
}
}
public class Q2
{
public static void main(String args[])
{
int x,y;
String color;
Scanner sc= new Scanner(System.in);
System.out.println("\n ente the x and x coordinates");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("\n enter the color:");
color=sc.next();
colorpoint br=new colorpoint(x,y,color);
br.display();
}
}

