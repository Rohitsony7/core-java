class DemoCLASUM
{
	public static void main(String args[])
		{
			int len=args.length;
			if(len==0)
				System.out.println("pls write command line arguments");
			else
			{
					System.out.println("COmmand line arguments are");
					for(int i=0;i<len;i++)
					{
						System.out.println(args[i]);
						
					
					}
					int sum=0;
					for(int i=0;i<len;i++)
						{
							sum=sum+Integer.parseInt(args[i]);
						}
					System.out.println("SUM IS:"+sum);
			}
		}
	}
}
						
				
