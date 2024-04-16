import java.util.Scanner;
import java.util.*;
class Account
{
int ano;
String aname;
int balance;
void accept()
{
Scanner sc= new Scanner(System.in);
System.out.println("\n enter the name of the customer");
aname=sc.next();
System.out.println("\n enter the ano of the customer");
ano=sc.nextInt();
System.out.println("\n enter the balance of the customer");
balance=sc.nextInt();
}
void display()
{
System.out.println("\n aname:"+aname);
System.out.println("\n ano:"+ano);
System.out.println("\n balance:"+balance);
}
static void sort(int num,Account a[])
{
Account temp=new Account();
for(int i=0;i<num;i++)
{
for(int j=0;j<num-1;j++)
{
if(a[i].balance<a[j].balance)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
}
public class Q2
{
public static void main(String args[])
{
Scanner sn= new Scanner(System.in);
System.out.println("\n how many account");
int num=sn.nextInt();
Account a[]=new Account[num];
for(int i=0;i<num;i++)
{
a[i]=new Account();
a[i].accept();
}
Account.sort(num, a);
for(int i=0;i<num;i++)
{
a[i].display();
}
}
}

