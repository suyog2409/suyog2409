import java.util.*;
import java.io.*;
public class Q1
{
public static void main(String args[])
{
LinkedList fruits=new LinkedList();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Guava");
fruits.add("Orange");
System.out.println("content of Linkedlist in reverse order");
ListIterator li= fruits.listIterator();
while(li.hasNext())
{
String s=(String)li.next();
}
while(li.hasPrevious())
{ String s=(String)li.previous();
System.out.println(s);
}
}
}

