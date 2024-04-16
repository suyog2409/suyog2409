import java.util.*;
class NumberIsZero extends Exception
{
public NumberIsZero(int n)
{
super();
}
}
public class Q1 {
public static void main(String[] args)
{
Scanner sn = new Scanner(System.in);
int Fact = 1;
System.out.println("Enter a Number : ");
int num = sn.nextInt();
try
{
if (num == 0)
{
throw new NumberIsZero(num);
}
else
{
for (int i = 1; i <= num; i++)
{
Fact = Fact * i;
}
System.out.println("Factorial of " + num + " is " + Fact);
}
}
catch (NumberIsZero e)
{
System.out.println("Exception Genreated " + e);
}
}
}

