class Demo5
{
	int[] sortedarray(int arr[])
	{
	int i,d,temp;
			for(i=0;i<(arr.length-1);i++)
			{	

				for(d=0;d<=(arr.length-i);d++)
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
		int a[]={12,324,534,67,45688};
		Demo3 d=new Demo3();
		d.sortedarray(a);
		System.out.println("------");
		for(int i:a)
		{	
			System.out.println(i);
		}
	}
}