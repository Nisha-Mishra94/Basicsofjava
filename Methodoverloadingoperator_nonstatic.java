package jbasicprogram;

public class Methodoverloadingoperator_nonstatic 
{

	 void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println("Addition of nonstatic overloadingmethod is="+sum);
	}
	 void Subtraction(int a,double b)
	{
		double sub=a-b;
		System.out.println("Subtraction of nonstatic overloadingmethod is="+sub);
	}
	 void Subtraction(double a,double b)
	{
		double sub=a-b;
		System.out.println("Subtraction1 of nonstatic overloadingmethod is="+sub);
	}
 void Multiplication(int a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication of nonstatic overloadingmethod is="+mul);
	}
	 void Multiplication(double a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication1 of nonstatic overloadingmethod is="+mul);
	}
void Division(int a,double b)
	{
		double div=a/b;
		System.out.println("division of nonstatic overloadingmethod is="+div);
	}
	void Division(double a,double b)
	{
		double div=a/b;
		System.out.println("division of nonstatic overloadingmethod is="+div);
	}
	 void Modulus(int a,double b)
	{
		double mod=a%b;
		System.out.println("modulus of nonstatic overloadingmethod is="+mod);
	}
	 void Modulus(double a,double b)
	{
		double mod=a%b;
		System.out.println("modulus2 of nonstatic overloadingmethod is="+mod);
	}

	public static void main(String[] args) 
	{
		Methodoverloadingoperator_nonstatic m1=new Methodoverloadingoperator_nonstatic();
		m1.addition(2.5,5);
		m1.Subtraction(5,1.5);
		m1.Subtraction(3.5,1.5);
		m1.Multiplication(6,1.5);
		m1.Multiplication(3.4,1.5);
		m1.Division(5,1.5);
		m1.Division(3.4,1.5);
		m1.Modulus(6,1.5);
		m1.Modulus(3.4,1.5);
	}

}
