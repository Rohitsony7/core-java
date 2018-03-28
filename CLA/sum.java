class sum
	{
		public static void main(String args[])
		{
				int arr[][]=new int [4][4];
				for(int i=0;i<4;i++) //for rows
				{
					for(int j=0;j<4;j++)
						{
							arr[i][j]=(int)(Math.random()*100);
							System.out.print(arr[i][j] +"\t");
						}
						System.out.println();
				}
			
		}
	}