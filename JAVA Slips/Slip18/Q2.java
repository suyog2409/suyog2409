import java.io.*;
public class Q2
{
public static void main(String args[]) throws
FileNotFoundException,IOException
{
FileInputStream f = new FileInputStream("abc.txt");
int n;
while((n=f.read())!=-1)
{
System.out.println(" "+Character.toUpperCase((char)n));
}
f.close();
}
}

