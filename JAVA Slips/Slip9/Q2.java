import java.util.Scanner;
class point3D
{
int x,y;
point3D()
{x=0; y=0;
}
point3D(int x, int y)
{ this.x=x; this.y=y;
}
void display()
{
System.out.println("\n Coordinates \nx:"+x+"\ny:"+y);
}
}
class colorpoint extends point3D
{ int z;
colorpoint()
{super(); z=0;
}
colorpoint(int x,int y,int z)
{
super(x,y);
this.z=z;
}
void display()
{ super.display();
System.out.println("\n Z: "+z);
}
}
public class Q2
{
public static void main(String args[])
{
int x,y,z;
Scanner sc= new Scanner(System.in);
System.out.println("\n ente the x and y coordinates");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("\n enter the z:");
z=sc.nextInt();
colorpoint br=new colorpoint(x,y,z);
br.display();
}
}

