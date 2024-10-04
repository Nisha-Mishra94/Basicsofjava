package jbasicprogram;
abstract class Flipkart2
{
	 void add()
	 {
	 System.out.println("hello");
	 }
	 void sub()
	 {
		 System.out.println("beautiful");
	 }
}
abstract class Amazon2 extends Flipkart2
{
	abstract void login();
	abstract void registration();
}
public class Google_method extends Amazon2
{

	public static void main(String[] args) {
		
		Google_method g1=new Google_method();
		g1.add();
		g1.sub();
		g1.login();
		g1.registration();
	}
	void login() 
	{
		
	System.out.println("person");
		
	}
	
	void registration() 
	{

		System.out.println("nice to meet you");
		
	}

}
