class Demo3
{
	void sortedarray(int arr[])
	{
	int i,d,temp;
			for(i=0;i<(arr.length-1);i++)
			{	

				for(d=0;d<(arr.length-1-i);d++)
				{
					if(arr[d]>arr[d+1])
					{
						temp=arr[d];
						arr[d]=arr[d+1];
						arr[d+1]=temp;
					}
				}
	
			System.out.println(arr[i]);
					
			}
				
	}
}	
 class UseDemo3
 {
	public static void main(String args[])
	{
		int a[]={12,324,534,67,45688,6898};
		Demo3 d=new Demo3();
		d.sortedarray(a);
	}
}