package jbasicprogram;

public class Stringtoarray {

	public static void main(String[] args) 
	{
		String name = "Nisha";

		// Convert the string to a char array
		char[] array = name.toCharArray();

		// Print array elements
		for (char i : array) {
		  System.out.println(i);
		}

	}

}
