package jbasicprogram;
class One
{
	One()
	{
		//super();
		System.out.println("i am");
	}
}
class Two extends One
{
	Two()
	{
		//super();
	System.out.println("loving");
}
}
class Three extends Two
{
	Three()
	{
		super();
	System.out.println("java");
}
}

public class Supernonpara 
{

	public static void main(String[] args) 
	{
		
		new Three();
	
	}

}
