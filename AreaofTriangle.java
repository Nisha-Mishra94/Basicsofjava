package jbasicprogram;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value of b");
		double b=s1.nextInt();
		System.out.println("Enter value of h");
		double h=s1.nextInt();
		double area=0.5*b*h;
		System.out.println("Area of Triangle is="+area);
		
		
		
	}

}
