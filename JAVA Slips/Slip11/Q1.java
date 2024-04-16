import java.util.*;
import java.io.*;
class mydate
{
int dd,mm,yy;
mydate(int dd,int mm, int yy)
{
this.dd=dd; this.mm=mm; this.yy=yy;
}
void display()
{ System.out.println("\n Date:"+dd+"/"+mm+"/"+yy);
}
}
public class Q1
{
public static void main(String args[])
{
mydate md=new mydate(15, 10,2003);
md.display();
}
}

