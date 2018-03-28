class DemoThrow3
{
	public static void main(String args[])
	{
		ArithmeticException d=new ArithmeticException("/by Zero");
		
		try
		{
		throw d;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("E.O.N");
	}
}