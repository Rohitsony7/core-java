import java.util.Scanner;
class FirstTryCatch
{
	public static void main(String args[])
	{
		Scanner obj =new Scanner(System.in);
		System.out.println("enetr any non zero no.");
		int i=0;
		int j= obj.nextInt();
		System.out.println("eneterd value is j");
		try
		{
		i=100/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("WE  ARE IN CATCH BLOCK");
			e.printStackTrace();
		}
		
		System.out.println("i is:"+i);
		System.out.println("End");
		obj.close();
	}
}