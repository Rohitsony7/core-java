import java.util.Scanner;
class SecondTryCatch
{
	public static void main(String args[])
	{
		int arr[]={22,33,44,55,66,66};
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter 0-5 no");
		int i=sc.nextInt();
		try
		{
		System.out.println("arry value is:"+arr[i]);
		}
		catch(Exception e)
		{
			System.out.println("WE  ARE IN CATCH BLOCK");
			e.printStackTrace();
		}
		
		System.out.println("END");
		sc.close();
	}
}