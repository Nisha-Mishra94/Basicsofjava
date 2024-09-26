package jbasicprogram;


public class Parathis 
{
	Parathis(int a)
	{
		System.out.println("hi...");
	}

	Parathis(String a , int b)
 { this(30);
	 System.out.println("hello");
 }
	Parathis(double a , int b, char c)
 {
		this("Hi",10);
	 System.out.println("Hey");
 }
public static void main(String[] args)
{
	new Parathis(22.55,10,'a');
		

	}
}



