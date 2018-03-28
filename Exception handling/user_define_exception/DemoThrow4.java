import java.util.Scanner;
class RATException extends Exception //Runtime exception
{
	RATException(String msg)
	{
		super(msg);
	}
}
class DemoThrow4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr any integer value");
			int i=0;
		try
		{
		 i=sc.nextInt();
		}
		catch( java.util.InputMismatchException e)
		{
			e.printStackTrace();
		}
		if(i==5)
		{
			RATException re=new RATException("wrong input,try another but not 5.");
			
			try
			{
			throw re;
			}
			catch(RATException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("i is:"+i);
			double x=100/(i-5);
			System.out.println("value of x is:"+x);
		}
		System.out.println("E.O.P");
	}
}
			