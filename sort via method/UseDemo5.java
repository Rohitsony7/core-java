class Demo5
{
	int[] sortedarray(int arr[])
	{
	int i,d,temp;
			for(i=0;i<(arr.length-1);i++)
			{	

				for(d=0;d<(arr.length-i-1);d++)
				{
					if(arr[d]>arr[d+1])
					{
						temp=arr[d];
						arr[d]=arr[d+1];
						arr[d+1]=temp;
					}
				}
	
		
					
			}	
			return arr;
				
	}
}	
 class UseDemo5
 {
	public static void main(String args[])
	{
		int a[]={1,22,333,4444,55555,666666,7777777};
		Demo5 d=new Demo5();
		int b[]=d.sortedarray(a);
		System.out.println("------");
		for(int i:b)
		{	
			System.out.println(i);
		}
	}
}