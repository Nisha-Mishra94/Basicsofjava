package jbasicprogram;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of l");
		int l=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		int area=l*b;
		System.out.println("Area of Rectangle is="+area);
	}

}
