import java.util.Scanner;
class employee
{
int id;
String name;
int salary;
void accept()
{
System.out.println("\n enter the name of the employee");
Scanner sc=new Scanner(System.in);
name=sc.next();
System.out.println("\n enter the id of the employee");
id=sc.nextInt();
System.out.println("\n enter the salary of the employee");
salary=sc.nextInt();
}
}
public class Q2
{
public static void main(String args[])
{
int n;
Scanner sp=new Scanner(System.in);
System.out.println("\n enter the number of employee");
n=sp.nextInt();
employee[] br=new employee[n];
for(int i=0;i<n;i++)
{
br[i]=new employee();
br[i].accept();
}
int max=0;
for(int i=1;i<n;i++)
{
if(br[i].salary < br[max].salary)
{
max=i;
}
}
System.out.println("\n The minimum salary of the emplyee
is:"+br[max].name);
}
}

