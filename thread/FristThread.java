class A extends Thread
{
	A()
	{
		start();
	}
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(+getName+"i is :"+i);
			}
		}
}

class SecondThread
{
	public static void main(String args[])
	{
		A oa=new A();
		A ob=new A();	
		A oc=new A();
		
		System.out.println("END OF PRGM");
	}
}











