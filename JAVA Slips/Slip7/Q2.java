import java.util.Scanner;
class student
{
int rollno;
String name;
int per;
student()
{
rollno=0;
name=" ";
per=0;
}
student(int rollno,String name,int per)
{
this.rollno=rollno;
this.per=per;
this.name=name;
}
void display()
{
System.out.println("\n Rollno:"+rollno+"\n per:"+per+"\n
name:"+name);
}
}
public class Q2
{
public static void main(String args[])
{
int rollno,per;
String name;
Scanner sc=new Scanner(System.in);
student[] p=new student[5];
for(int i=0;i<5;i++)
{
System.out.println("enter the roll no and persentage: ");
rollno=sc.nextInt();
per=sc.nextInt();
System.out.println("\n enter the name of the student");
name=sc.next();
p[i]=new student(rollno,name,per);
}
for(int i=0;i<5;i++)
{
System.out.println("\n Details of student no:"+i+1);
p[i].display();
}
}
}

