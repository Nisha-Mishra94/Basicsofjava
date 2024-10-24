package jbasicprogram;

interface Login
{
	void Registration();
	
}
public class Interface1 implements Login
{
	public static void main(String[] args) 
	{
		Interface1 i1=new Interface1();
		i1.Registration();
		
	}
    public void Registration()
	{
		System.out.println("Hi I am abc");
	}

}
