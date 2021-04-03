package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo1 

{
public static void main(String[] args) 


{
	
	ArrayList al = new ArrayList();
	
	al.add("Sachin");
	
	al.add(147);
	
	al.add ("O+");
	
	al.add(null);
	
	al.add("Sachin");
	
	
	
	System.out.println(al);
	
	System.out.println(al.size());
	
	System.out.println(al.isEmpty());
	
	System.out.println(al.get(0));
	
	System.out.println(al.contains("Sachin"));
	
	System.out.println(al.indexOf("Sachin"));
	
	System.out.println(al.lastIndexOf("Sachin"));
	
	System.out.println(al);
	
	// insert info in between Arraylist--->Right shift operation
	
	al.add(2, "C+");
	
	System.out.println(al);
	
	// Remove/delete info in between Arraylist ---> Left shift operation...
	
	al.remove(2);
	
	System.out.println(al);
	
	// Update /Modify info in Arraylist...
	
	al.set(2, "C+");
	
	System.out.println(al);
	
	System.out.println("----Print All information in Arraylist using Iterator cursor---");
	
	Iterator itr =al.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("----Print All information in Arraylist using ListIterator cursor---");
	
    ListIterator litr =al.listIterator();
    
    while(litr.hasNext())
    	
    {
    	System.out.println(litr.next());
    }
    
    System.out.println("----Print All information in Arraylist using For Loop---");
    
    for(int i=0; i<=al.size()-1; i++)
    {
    	System.out.println(al.get(i));
    }
    
    System.out.println("----Print All information in Arraylist using Foreach Loop---");
    
    for(Object s1 :al)
    	
    {
    	System.out.println(s1);
    }
}



}
