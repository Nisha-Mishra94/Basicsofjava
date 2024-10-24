package jbasicprogram;
import java.io.*;
import java.util.*;

public class Mapinterfacewhile {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
		hm.put(110,"R");  
		hm.put(120,"P");  
		hm.put(130, "D");    
		hm.put(140, "L");  
		hm.put(150, "N");  
		Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
		while(it.hasNext())  
		{  
		int key=(int)it.next();  
		System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
		}  

	}

}
