package jbasicprogram;
import java.util.Collection;
import java.util.ArrayList;

public class Collectionmethod
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add(45);
		c1.add("Nisha");
		c1.add(171);
		c1.add(6.8);
		c1.add(true);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add(123);
		System.out.println(c2);
		boolean b1=c1.equals(c2);
		System.out.println(b1);
		boolean b2=c1.contains("Nisha");
		System.out.println(b2);
		
		

	}

}
