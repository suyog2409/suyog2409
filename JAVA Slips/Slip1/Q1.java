import java.util.Scanner;
public class Q1
{
public static void main(String args[])
{
int num;
Scanner br=new Scanner(System.in);
System.out.println("Enter the number for
multiplication table");
num=br.nextInt();
System.out.println("your number is "+num+" ");
for (int i=1; i<=10; i++)
{
System.out.println(num+"*"+i+"="+num*i);
}
}
}

