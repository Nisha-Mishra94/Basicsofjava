package jbasicprogram;

import java.util.Scanner;

public class CircumferenceofCircle {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of pi");
		double pi=s1.nextDouble();
		System.out.println("Enter value of radius");
		double r=s1.nextDouble();
		double area=2*pi*r;
		System.out.println("Circumference of Circle is="+area);

	}

}
