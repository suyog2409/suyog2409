import java.util.Scanner;
import java.io.*;
public class Q1
{
public static void main(String args[])
{
int a[]=new int[10];
Scanner br=new Scanner(System.in);
System.out.println("enter the size of array");
int n=br.nextInt();
System.out.println("enter the array elements");
for(int i=0;i<n;i++)
{
a[i]=br.nextInt();
}
System.out.println("your array elements are: ");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("max element of array is :");
int max=a[0];
for(int i=1 ;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println(max);
}
}

