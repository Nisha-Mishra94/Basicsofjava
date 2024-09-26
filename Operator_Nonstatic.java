package jbasicprogram;

public class Operator_Nonstatic

{
	void addition()
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("Addition is="+sum);
	}
	void subtraction()
	{
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println("Subtraction is="+sub);
	}
	void Multiplication()
	{
		int a=10;
		int b=5;
		int mul=a*b;
		System.out.println("Multiplication is="+mul);
	}
	void Division()
	{
		int a=10;
		int b=5;
		int div=a/b;
		System.out.println("Division is="+div);
	}
	void modulus()
	{
		int a=10;
		int b=5;
		int mod=a%b;
		System.out.println("Modulus is="+mod);
	}

	public static void main(String[] args)
	{
		Operator_Nonstatic o1=new Operator_Nonstatic();
		o1.addition();
		o1.subtraction();
		o1.Multiplication();
		o1.Division();
		o1.modulus();
		
	}

}
