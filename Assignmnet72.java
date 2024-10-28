package jbasicprogram;
import java.util.HashMap;
import java.util.Map;

public class Assignmnet72 {

	public static void main(String[] args)
	{
		Map<Integer,String > m1 = new HashMap<Integer, String >();
		m1.put( 1 , "Rohan");
		m1.put(2, "Sohan");
		m1.put(3, "Mohan" );
		m1.put(4, "Rohit");
		m1.put(5 , "Amit");
		
		
		if( m1.containsKey(1)) {
			String r1 = m1.get(1);
			System.out.println("roll no 1 is "+r1);
		}
		else {
			System.out.println("roll no 1 is not present");
		}

	}

}
