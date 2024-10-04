package jbasicprogram;

abstract class Amazon1
{
	abstract void add();
	abstract void sub();
}
public class abstractconcrete extends Amazon1
{
	public static void main(String[] args)
	{
		abstractconcrete a1=new abstractconcrete();
		a1.add();
		a1.sub();
		
	}
void add() 
	{
	System.out.println("hey");
		}

	void sub()
	{
		System.out.println("nisha");
		
	}

}
