import java.io.IOException;
import java.util.Scanner;
abstract class order
{
int id;
String description;
}
class purches_order extends order
{
String custname;
Scanner sc= new Scanner(System.in);
void accpet1()
{
System.out.println("\n enter the id and description: ");
id=sc.nextInt();
description=sc.next();
System.out.println("\n enter the cust name: ");
custname=sc.next();
}
void display1()
{
System.out.println("\n ID: "+id+"\n Descri :"+description+"\n
custname: "+custname);
}
}
public class Q2
{
public static void main(String args[])
{
purches_order[] br=new purches_order[3];
for(int i=0;i<3;i++)
{
br[i]= new purches_order();
br[i].accpet1();
br[i].display1();
}
}
}

