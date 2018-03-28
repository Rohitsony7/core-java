class Demo6
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
 class UseDemo6
 {
	public static void main(String args[])
	{
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			 a[i]=(int)(Math.random()*100);
		}
		Demo6 d=new Demo6();
		int b[]=d.sortedarray(a);
		System.out.println("------");
		for(int i:b)
		{	
			System.out.println(i);
		}
	}
}