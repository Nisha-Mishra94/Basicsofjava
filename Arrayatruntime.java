package jbasicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayatruntime {

	public static void main(String[] args)
	{
		int num[]=new int[3];
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			num[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
	}

}
