package jbasicprogram;
class Parent_Class
{
	void login()
	{
		System.out.println("Login with username");
	}
}

public class Methodoverriding extends Parent_Class
{
	void login()
	{
		System.out.println("Login with Mobile number");
		super.login();
	}
	public static void main(String[] args) 
	{
		Methodoverriding m1=new Methodoverriding();
		m1.login();

	}

}
