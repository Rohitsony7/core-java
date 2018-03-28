class DemoPattern2
{
	public static void main(String args[])
	{
		int count=(int)(Math.random()*20);
		System.out.println("Height is:"+count);
		for(int i=0;i<count;i++)
		{	
			for(int j=0;j<=i;j++)
			{	
				System.out.print("*");
			}
		System.out.println();
		}
	}
}