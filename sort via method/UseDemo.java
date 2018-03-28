class Demo
{
	void values()
	{	int a[]={12,34,34,56,45,6,78,76};
		int len=a.length;

	for(i=0;i<len;i++)
	{
		System.out.println(a[i]);
	}
	}
	int sort(int arr[])
		{
	
			int len=arr.length;

			int i,d,temp;
			for(i=0;i<(len-1);i++)
			{	

				for(d=0;d<len-1-i;d++)
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
class UseDemo
{
	public static void main(String args[])
	{	
		demo d=new demo();
		
		System.out.println(+d.values());
	
	}
}	
			
		
			
		