class Kpattern
{
	public static void main(String args[])
	{	int k=0;
		for(int i=0;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print("*");
								
			}
           System.out.println("");					

			
		}
		

		for(int i=1;i<=6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");			
		}
				
						
		
	}
}