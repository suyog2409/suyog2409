public class Q1
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int rev=0;
int digit;
while(num!=0)
{
digit=num%10;
rev=rev*10+digit;
num=num/10;
}
System.out.println("Reverse number is:"+rev);
}
}

