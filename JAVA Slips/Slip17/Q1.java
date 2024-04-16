class mynumber
{
private int n;
mynumber(int n)
{
this.n=n;
}
void isodd()
{
if(n%2==0)
{
System.out.println("not odd");
}
else
{
System.out.println("odd");
}
}
}
public class Q1
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
mynumber br= new mynumber(n);
br.isodd();
}
}
