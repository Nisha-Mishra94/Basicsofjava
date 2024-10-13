package jbasicprogram;

public class Valuepart {

	public static void main(String[] args)
	{
		int roll[]=new int[3];
		roll[0]=76;
		roll[1]=77;
		roll[2]=78;
		int notocheck=76;
		for(int i=0;i<3;i++)
		{
			if(notocheck==roll[i])
			{
				System.out.println("the given number is part of array at indexposition"+i);
			}
			else
			{
				System.out.println("the given number is not part of array at indexposition"+i);
			}
		}
	}

}
