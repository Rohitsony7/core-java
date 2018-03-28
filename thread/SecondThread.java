class A extends Thread
{
	A(String name)
	{
		super(name);
		start();
	}
		public void run()
		{	
			try
			{
				for(int i=0;i<5;i++)
				{
					
					System.out.println(getName()+":"+i);
					sleep(100);
				}
			
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}
		
}

class SecondThread
{
	public static void main(String args[])
	{
		A oa=new A("1St");
		A ob=new A("2nd");	
		A oc=new A("3rd");

		try
		{
			Thread.sleep(10000);
			System.out.println("END OF PRGM");
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}











