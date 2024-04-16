import java.util.*;
import java.io.*;
public class Q1
 {
    public static void main(String args[])
    {
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        ht.put("Sanika",90000);
        ht.put("Krutika",80000);
        ht.put("jyoika",60000);
        ht.put("veerika",10000);
        ht.put("Sanika",20000);
        System.out.println("the contents of the hashtable is:");
        Enumeration <String> k=ht.keys();
        Enumeration<Integer> v=ht.elements();
        while(k.hasMoreElements())
        {
            System.out.println(k.nextElement()+"\t"+v.nextElement());
        }
    }
}
