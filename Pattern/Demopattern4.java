class Demopattern4
{
	public static void main(String args[])
	{	int i,space,k=0;
		int row=(int)(Math.random()*20);
		System.out.println("Count is:"+row);
		for( i=row;i>=1;i--)
		{
			for(space=(row-i);space>=1;--space)
			{
				System.out.print("  ");
			
			}
			for(k=2*i-1;k>=1;k--)
			{
				System.out.print("* ");
			}	
		
		System.out.println("\n");
		}
		
		
	}
}