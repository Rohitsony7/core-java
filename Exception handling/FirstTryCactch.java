import java.util.Scanner;
class FirstTryCactch
{
	public static void main(String args[])
	{
		Scanner obj =new Scanner(System.in);
		System.out.println("enetr any non zero no.");
		int i=0;
		int j= obj.nextInt();
		System.out.println("eneterd value is j");
		
		i=100/j;
		
		
		System.out.println("i is:"+i);
		System.out.println("End");
		obj.close();
	}
}