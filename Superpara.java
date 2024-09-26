package jbasicprogram;
class Black
{
	Black(String a)
	{
		
		System.out.println("i am");
	}
}
class Blue extends Black
{
	Blue(int a)
	{
		super("wow");
	System.out.println("loving");
}
}
class Green extends Blue
{
	Green()
	{
		super(20);
	System.out.println("java");
}
}
public class Superpara 
{
public static void main(String[] args)
	{
		new Green();

	}

}
