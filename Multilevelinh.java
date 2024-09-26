package jbasicprogram;
class Firstgeneration
{
	static void fgen()
	{
		System.out.println("my generation is first");
	}
	void fold(int a)
	{
		System.out.println("my age is="+a);
	}
}
class Secondgeneration extends Firstgeneration
{
	static void sgen()
	{
		System.out.println("my generation is second");
	}
	void sold(int a)
	{
		System.out.println("my age is="+a);
	}
}
class Thirdsgeneration extends Secondgeneration
{
	static void tgen()
	{
		System.out.println("my generation is second");
	}
	void told(int a)
	{
		System.out.println("my age is="+a);
	}
}

public class Multilevelinh extends Thirdsgeneration
{

	public static void main(String[] args) 
	{
		Multilevelinh m1=new Multilevelinh();
		fgen();
		m1.fold(60);
		sgen();
		m1.sold(40);
		tgen();
		m1.told(20);
		System.out.println("i am still child");
	}

}
