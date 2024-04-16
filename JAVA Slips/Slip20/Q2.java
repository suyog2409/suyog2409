import java.util.Scanner;
class employee
{
int id,salary;
String name,dept;
static int count=0;
employee()
{
id=0;
salary=0;
name=" ";
dept=" ";
}
employee(int id,int salary,String name,String dept)
{
this.id=id;
this.salary=salary;
this.name=name;
this.dept=dept;
}
void display()
{
System.out.println("\n ID: "+id+"\n salary: "+salary+"\n name:
"+name+"\n dept: "+dept);
}
}
public class Q2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
employee[] br=new employee[3];
for(int i=0;i<3;i++)
{
System.out.println("\n enter the id,salary,name,dept");
int id=sc.nextInt();
int salary=sc.nextInt();
String name=sc.next();
String dept=sc.next();
br[i]=new employee(id,salary,name,dept);
br[i].display();
employee.count++;
System.out.println("\n The count of object is: "+employee.count);
}
}
}

