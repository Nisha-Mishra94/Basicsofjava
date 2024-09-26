package jbasicprogram;
class College
{
	 void student(String a)
	{
		System.out.println("My Name is="+a);
	}
}
public class Singlelevelnon extends College
{
	void marks(int a)
	{
		System.out.println("My Marks is="+ a);
		}

	public static void main(String[] args)
	{
		Singlelevelnon s1=new Singlelevelnon();
		s1.student("Nisha");
		s1.marks(20);

	}

}
