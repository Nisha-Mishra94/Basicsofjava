package jbasicprogram;

public class Reversestring 
{

	public static void main(String[] args) 
	{
		String input="nisha";
		String output="";
		for(int i=4;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
        System.out.println(output);
	}

}
