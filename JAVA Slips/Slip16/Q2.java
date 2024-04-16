import java.util.Scanner;
class employee
{
int salary;
String name;
void accpet1()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the name and salary");
name=sc.next();
salary=sc.nextInt();
}
void display1()
{
System.out.println("\n Name of employee: "+name);
System.out.println("\n Salary of employee: "+salary);
}
}
class programmer extends employee
{
String prolanguage;
void accpet2()
{
System.out.println("\n enter the proglang : ");
Scanner bp=new Scanner(System.in);
prolanguage=bp.next();
}
void display2()
{
System.out.println("\n prolanguage name: "+prolanguage);
}
}
public class Q2
{
public static void main(String args[])
{
programmer br= new programmer();
br.accpet1();
br.accpet2();
br.display1();
br.display2();
}
}

