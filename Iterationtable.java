package jbasicprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterationtable {

	public static void main(String[] args) 
	{
		ArrayList<String> alphabet = new ArrayList<>();
		alphabet.add("A");
		alphabet.add("B");
		alphabet.add("C");
		alphabet.add("D");

        // Iterating using Iterator
       
        Iterator<String> iterator = alphabet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);


	}
	}

}
