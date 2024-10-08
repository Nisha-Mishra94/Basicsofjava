package jbasicprogram;

import java.util.Arrays;

public class Arraynullvalues {

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		name[0]="ram";
		name[1]="aam";
		name[2]=null;
		System.out.println(Arrays.toString(name));

	}

}
