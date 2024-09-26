package jbasicprogram;

public class Methodoverloadingnonstatci_practice
{
	static void add(int a, int b)
	{
	   int sum=a+b;
	   System.out.println("add"+sum);
	}
	void add(double a,int b)
	{
		double sum=a+b;
		System.out.println("add"+sum);
	}

	public static void main(String[] args) 
	{
		Methodoverloadingnonstatci_practice m1=new Methodoverloadingnonstatci_practice();
		m1.add(1, 7);
		add(1,4);
	}

}
