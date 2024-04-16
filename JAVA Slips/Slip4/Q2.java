import java.util.Scanner;
import java.util.*;
class product
{
int id;
String name;
int price;
void accept()
{
Scanner sc= new Scanner(System.in);
System.out.println("\n enter the id of the product\n");
id=sc.nextInt();
System.out.println("\n enter the name of the product\n");
name=sc.next();
System.out.println("\n enter the price\n");
price=sc.nextInt();
}
void display()
{ System.out.println("Id: "+id);
System.out.println("Name: "+name);
System.out.println("Price: "+price);
}
}
public class Q2
{
public static void main(String args[])
{
product[] p=new product[5];
for(int i=0;i<5;i++)
{ p[i]=new product();
p[i].accept();
p[i].display();
}
int min=0;
for(int i=0;i<5;i++)
{
if(p[i].price<p[min].price)
{
min=i;
}
}
System.out.println("\n The minimum price of the product is:
"+p[min].name);
}
}

