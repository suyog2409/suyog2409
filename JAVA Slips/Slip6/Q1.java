import java.util.*;
public class Q1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("\n enter the count of number: ");
int n=sc.nextInt();
TreeSet t=new TreeSet();
System.out.println("\n enter the values: ");
for (int i=0;i<n;i++)
{
t.add(sc.nextInt());
}
System.out.println("\n sorted elements are: "+t);
System.out.println("\n enter the element to search: ");
int num=sc.nextInt();
ArrayList al= new ArrayList(t);
if(al.contains(num))
{
System.out.println("\n Element is found at:
"+al.indexOf(num)+"this location");
}
else
{
System.out.println("\n Element not found");
}
}
}

