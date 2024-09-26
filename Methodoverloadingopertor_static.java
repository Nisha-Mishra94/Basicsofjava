package jbasicprogram;

public class Methodoverloadingopertor_static
{
	
	static void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println("Addition of static overloadingmethod is="+sum);
	}
	static void Subtraction(int a,double b)
	{
		double sub=a-b;
		System.out.println("Subtraction of static overloadingmethod is="+sub);
	}
	static void Subtraction(double a,double b)
	{
		double sub=a-b;
		System.out.println("subtraction2 of static overloadingmethod is="+sub);
	}
	static void Multiplication(int a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication of static overloadingmethod is="+mul);
	}
	static void Multiplication(double a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication2 of static overloadingmethod is="+mul);
	}
	static void Division(int a,double b)
	{
		double div=a/b;
		System.out.println("division of static overloadingmethod is="+div);
	}
	static void Division(double a,double b)
	{
		double div=a/b;
		System.out.println("division2 of static overloadingmethod is="+div);
	}
	static void Modulus(int a,double b)
	{
		double mod=a%b;
		System.out.println("modulus of static overloadingmethod is="+mod);
	}
	static void Modulus(double a,double b)
	{
		double mod=a%b;
		System.out.println("modulus2 of static overloadingmethod is="+mod);
	}
	public static void main(String[] args)
	{
		addition(2.5,5);
		Subtraction(5,1.5);
		Subtraction(3.5,1.5);
		Multiplication(6,1.5);
		Multiplication(3.4,1.5);
		Division(5,1.5);
		Division(3.4,1.5);
		Modulus(6,1.5);
		Modulus(3.4,1.5);
		
	}

}
