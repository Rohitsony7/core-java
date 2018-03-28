class A extends Thread
{
	A(String name)
	{	
		super(name);
		setDaemon(true);
		start();
	}
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(getName()+" is:"+i);
				try
				{sleep(1000);}
				catch(Exception e)
				{e.printStackTrace();}
			}
		}
}
class ThirdThread
{ 
	public static void main(String args[])
	{
		A oa=new A("1st");
		A ob=new A("2nd");
		A oc=new A("3rd");
							
			try
			{
				System.out.println(oa.isAlive());					
				System.out.println(ob.isAlive());
				System.out.println(oc.isAlive());
				oa.join();
				ob.join();
				oc.join();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
							System.out.println(oa.isAlive());					
							System.out.println(ob.isAlive());
							System.out.println(oc.isAlive());

			System.out.println("E.O.P");
	}
}

		