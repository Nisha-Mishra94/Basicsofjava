package jbasicprogram;
interface Login
{
	void student();
}
interface Registration
{
	void rollno();
}

public class Multiplelevel implements Login,Registration
{

	public static void main(String[] args) 
	{
		Multiplelevel m1=new Multiplelevel();
		m1.student();
		m1.rollno();

	}
	public void rollno()
	{
		 System.out.println("Your registration done sucessefully");
	}

	public void student() 
	{
		
		 System.out.println("Please check with your roll number");
	}

}
