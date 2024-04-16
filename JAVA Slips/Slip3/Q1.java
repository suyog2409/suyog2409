import java.util.Scanner;
public class Q1
{ public static void main(String args[])
{
int sum=0,i,n; int a1[]=new int[20];
System.out.println("enter the array size");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the number in array ");
for (i = 0; i < n; i++)
{ a1[i]=sc.nextInt();
}
System.out.println("your array elememts are :");
for (int j = 0; j < n; j++)
{
System.out.println(a1[j]); sum=sum+a1[j];
}
System.out.println("Your sum of array element is: "+sum);
}
}

