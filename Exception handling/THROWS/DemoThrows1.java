import java.io.IOException;
class DemoThrows1
{
	public static void main(String args[])
	{
		System.out.println("Enter any char");
		try
		{
		char ch=(char)System.in.read();
		System.out.println("Enterd char is:"+ch);
		}
		catch( IOException e)
		{
		e.printStackTrace();
		}
	
		System.out.println("E.N.D");
	}
}