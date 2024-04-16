import java.util.*;
public class Q2
{
public static void main(String args[])
{
LinkedList li= new LinkedList();
li.add("Red");
li.add("Blue");
li.add("Yellow");
li.add("Orange");
Iterator l=li.iterator();
System.out.println("\nprinting element using terator\n");
while (l.hasNext())
{
System.out.println(l.next());
}
System.out.println("\nelemet in reverse order\n");
ListIterator l2=li.listIterator();
while(l2.hasNext())
{
String s=(String)l2.next();
}
while(l2.hasPrevious())
{
String s=(String)l2.previous();
System.out.println(s);
}
LinkedList li2= new LinkedList();
li2.add("pink");
li2.add("green");
li.addAll(2,li2);
System.out.println("\n After adding");
System.out.println(li);
}
}

