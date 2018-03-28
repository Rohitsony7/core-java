class Demopattern3
{
	public static void main(String args[])
	{	
		int i,space,k=0;
		int row=(int)(Math.random()*20);
		System.out.println("Count is:"+row);
	for( i=1;i<=row;i++)
	{
			for(space=1;space<=(row-i);space++)
		{	
			System.out.print("  ");
		}	
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}	
		
		System.out.println("\n");
	}
		
	}
}