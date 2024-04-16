import java.util.Scanner;
import java.util.*;
public class Q1
{
public static void main(String args[])
{
//creating arraylist
int n,num;
ArrayList al=new ArrayList();
System.out.println("enter the no ");
Scanner br= new Scanner(System.in);
n=br.nextInt();
System.out.println("enter number in arraylist");
for(int i=0;i<n;i++)
{
num=br.nextInt();
al.add(num);
}//display array element
System.out.println("elements of arraylist: "+al);
}
}

