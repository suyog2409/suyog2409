import java.util.Scanner;
class student
{
int rollno;
String name;
static int count=0;
student()
{
rollno=0;
name=" ";
}
student(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println("\n roll no: "+rollno+"\n name: "+name);
}
}
public class Q2
{
public static void main(String args[])
{
System.out.println("\n enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
student[] br=new student[n];
for(int i=0;i<n;i++)
{
System.out.println("\n enter the roll no and name of the
student");
int rollno=sc.nextInt();
String name=sc.next();
br[i]=new student(rollno,name);
student.count++;
System.out.println("\n The count of object is:
"+student.count);
}
for(int i=0 ;i<n;i++)
{
br[i].display();
}
}
}

