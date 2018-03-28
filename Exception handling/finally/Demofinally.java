class Demofinally
{
	public  static void main(String args[])
	{
		int a=(int)(Math.random()*2);
		System.out.println("Random no is a:"+a);
		
		try
		{
		int b=50/a;
		System.out.println("Value of b is:"+b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
		
		System.out.println("E.N.D");
		}
	}
}