package jbasicprogram;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args)
	
	{
		int num[]=new int[3];
		num[0]=45;
		num[1]=46;
		num[2]=47;
		int num1[]=new int[3];
		num1[0]=45;
		num1[1]=46;
		num1[2]=49;
		   boolean b1=Arrays.equals(num, num1);
		   System.out.println(b1);
		   if(b1==true)
		   {
			   System.out.println("Arrays are Equal");  
		   }
		   else
		   {
			   System.out.println("Arrays are not Equal"); 
			   
		   }
		
		

	}

}
