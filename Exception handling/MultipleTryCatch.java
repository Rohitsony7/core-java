import java.util.Scanner;
import java.util.InputMismatchException;
class MultipleTryCatch
{
	public static void main(String args[])
	{
		int arr[]={11,22,33,44,55,66};
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr any no. bw 0-5");
		int i=0;
		try
		{
		i=sc.nextInt();
		System.out.println("arry value is:"+arr[i]);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("END");
		sc.close();
	}
}
		
		
		