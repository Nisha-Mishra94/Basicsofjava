package jbasicprogram;
interface Red
{
	abstract void color();
	abstract void shape();
}
abstract class Yellow implements Red
{
	abstract void color1();
	abstract void color2();
}
public class Program3 extends Yellow
{
	void color5()
	{
		System.out.println("i am color 5");
	}
	void color6()
	{
		System.out.println("i am color 6");
	}

	public static void main(String[] args) 
	
	{
		Program3 p3=new Program3();
		p3.color();
		p3.color1();
		p3.color2();
		p3.color5();
		p3.color6();
		
	}
	@Override
	void color1() {
		System.out.println("i am color 1");
		
	}
	@Override
	void color2() {
		System.out.println("i am color 2");
		
	}
	@Override
	public void color() {
		System.out.println("i am color");
		
	}
	@Override
	public void shape() {
		System.out.println("i am shape");
	}

}
