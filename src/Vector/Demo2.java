package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo2 

{
public static void main(String[] args) 

{
	Vector V = new Vector();
	
	V.add("Sachin");
	
	V.add(145);
	
	V.add("Sachin");
	
	V.add('S');
	
	V.add(null);
	
	V.add("O+");
	
	System.out.println(V);
	
	System.out.println(V.capacity());
	
	System.out.println(V.size());
		
	System.out.println(V.get(5));// O+
	
	System.out.println(V.contains("Sachin")); //if infor is correct then true & if wrong then false..args.
	
	System.out.println(V.indexOf("Sachin"));
	
	System.out.println(V.lastIndexOf("Sachin"));
	
	System.out.println(V);
	
	// insert ino in between Vector --> Right shift opration
	
	V.add(2, "Balu");
	
	System.out.println(V);
	
	System.out.println(V.size());
	
	System.out.println(V.get(1));
	
	// insert ino in between Vector --> Remove / delete opration
	
	V.remove(2);
	
	System.out.println(V);
	
	System.out.println("-----Print all info in Vector using Listiterator cursor---");
	
	ListIterator Ltir = V.listIterator();
	
	while(Ltir.hasNext())
		
	{
		System.out.println(Ltir.next());
	}
	
	System.out.println("-----Print all info in Vector using iterator cursor---");
	
	Iterator itr = V.iterator();
	
	while(itr.hasNext())
		
	{
		System.out.println(itr.next());
	}
	
	
	System.out.println("-----Print all info in Vector using for loop---");	
	
	for(int i=0; i<=V.size()-1; i++)
		
	{
		System.out.println(V.get(i));
	}
	
	System.out.println("-----Print all info in Vector using foreach loop---");
	
	for(Object s1 : V)
		
	{
		System.out.println(s1);
	}
	
	System.out.println("-----Print all info in Vector using Enumaration Method---");
	
	Enumeration enu = V.elements();
	
	while(enu.hasMoreElements())
		
	{
		System.out.println(enu.nextElement());
	}
}
}
