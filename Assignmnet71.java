package jbasicprogram;

import java.util.HashMap;
import java.util.Map;

public class Assignmnet71 
{

	public static void main(String[] args)
	{

		Map<String , Integer> m1 = new HashMap<String , Integer>();
		m1.put("Mango", 10);
		m1.put("Banana", 20);
		m1.put("Apple", 30);
		m1.put("Orange", 40);
		m1.put("grapes", 50);
		m1.put(null, null);
		
		System.out.println(m1);
		
		System.out.println(m1.get("quantity of fruit"+"Mango"));
		
		m1.remove("Apple");
		
		for (Integer f1 : m1.values()){
			 System.out.println(f1);
		 }
		m1.containsKey("grapes");
		m1.containsValue(50);


	}

}
