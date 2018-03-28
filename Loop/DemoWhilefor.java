import java.util.Scanner;
class DemoWhilefor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		while(sc.hasNextInt())
		{
			int value=sc.nextInt();
			System.out.println("ur int is:"+value);
		}
		sc.close();
	}
}
