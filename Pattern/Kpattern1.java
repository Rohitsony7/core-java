class Kpattern1
{
	public static void main(String args[])
	{
		for(int i=0;i<3;i++)
		{
			for(int j=3;j>i;j--)
			{	
				if(j==3)
				{
					System.out.println("* *");
				}
				else
				{
				System.out.print("*");
			    System.out.println("");
				}
				
			}
		
		}
	}
}