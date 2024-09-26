package jbasicprogram;

import java.util.Scanner;

public class GlobalVaribale_Scanner 
{
	static int a;
	static int b;
	
	
	
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		 a=s1.nextInt();
		System.out.println("Enter value of b");
		 b=s1.nextInt();
		 int sum=a+b;
		 System.out.println("Addition is="+sum);
		 int sub=a-b;
		 System.out.println("Subtraction is="+sub);
		
		
		}

}
