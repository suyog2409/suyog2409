class mynumber
{
private int n ;
mynumber(int n)
{
this.n=n;
}
void iseven()
{
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("not even");
}
}
}
public class Q1
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
mynumber br=new mynumber(n);
br.iseven();
}
}
