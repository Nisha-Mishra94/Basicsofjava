package jbasicprogram;

import java.util.Arrays;

public class Arrayoutofbound {

	public static void main(String[] args)
	{
		int rollno[]=new int[2];
		rollno[0]=11;
		rollno[1]=12;
		rollno[2]=13;
		System.out.println(Arrays.toString(rollno));
		
	}

}
