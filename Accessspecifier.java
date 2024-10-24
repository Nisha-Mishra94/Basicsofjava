package jbasicprogram;

public class Accessspecifier 
{
	public void Login()
	{
		System.out.println("Hi please login");
	}
	protected void Registration()
	{
		System.out.println("Hi please Register");
	}
	void Fees()
	
	{
		System.out.println("Hi please pay fees");
	}
 private void College()
 {
	 System.out.println("Hi please come college");
 }
	
	
	public static void main(String[] args) 
	{
		Accessspecifier a1=new Accessspecifier();
		a1.Login();
		a1.Registration();
		a1.Fees();
		a1.College();

	}

}
