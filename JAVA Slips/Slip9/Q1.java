import java.io.*;
public class Q1
{
public static void main(String args[]) throws IOException
{
int num,sum=0,rem,i;
BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
System.out.println("Enter the number: ");
num=Integer.parseInt(br.readLine());
System.out.println("Your number is: "+num);
for (i = 1; i < num; i++)
{
rem=num%i;
if(rem==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.println("Number is perfect");
}
else
{
System.out.println("Number is not perfect");
}
}
}

