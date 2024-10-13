package jbasicprogram;
import java.util.Arrays;

public class Program1 
{
	static int alphacount;
	static int numcount;
	static int spacecount;
		public static void main(String[] args) 
	{
			String input="KA 53 EP 7902 #Bangalore Regn!";
			char c1[]=input.toCharArray();
			System.out.println(Arrays.toString(c1));
			for(int i=0;i<input.length();i++)
			{
				boolean b1=Character.isAlphabetic(c1[i]);
				if(b1==true)
				{
					alphacount++;
				}
				boolean b2=Character.isAlphabetic(c1[i]);
				if(b2==true)
				{
					numcount++;
				}
				boolean b3=Character.isAlphabetic(c1[i]);
				if(b3==true)
				{
					spacecount++;
				}
				int spclcount=input.length()-(alphacount+numcount+spacecount);
				System.out.println("number of alphabet in string is=>"+alphacount);
				System.out.println("number of number in string is=>"+numcount);
				System.out.println("number of space in string is=>"+spacecount);
				System.out.println("number of specailchar in string is=>"+spclcount);
				
			}
	
		
		
		

	}

}
