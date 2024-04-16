import java.util.*;
public class Q1
{
public static void main(String args[])
{
LinkedList Fruits= new LinkedList();
Fruits.add("Apple");
Fruits.add("Banana");
Fruits.add("Guava");
Fruits.add("Orange");
System.out.println("fruits list print using iterator...");
Iterator i= Fruits.iterator();
while (i.hasNext())
{
System.out.println(i.next());
}
}
}

