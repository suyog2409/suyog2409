class mynumber
{
private int n;
mynumber()
{
n=0;
}
mynumber(int n)
{
this.n=n;
}
void isnegative()
{
if (n<0)
{
System.out.println("\n number is negative");
}
}
void ispositive()
{
if (n>0)
{
System.out.println("\n number is positive");
}
}
void iszero()
{
if (n==0)
{
System.out.println("\n number is zero");
}
}
void iseven()
{
if(n%2==0)
{
System.out.println("\n number is even");
}
}
void isodd()
{
if(n%2!=0)
{
System.out.println("\n number is odd");
}
}
}
public class Q2
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
mynumber my=new mynumber(n);
my.iseven();
my.isnegative();
my.isodd();
my.ispositive();
my.iszero();
}
}

