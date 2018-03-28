class DemoArray2
{
	public static void main(String args[])
		{   
			int arr[]=new int[(int)(Math.random()*100)];
			int len=arr.length; 
			System.out.println("The length is:" +len);
			int sum=0;
			for (int i=0;i<len;i++)
			{   
				arr[i]=(int)(Math.random()*100);
				System.out.println("Array ["+i+"] is:"+arr[i]);
				sum=sum+arr[i];

				
			}
							System.out.println("Total sum of array is:"+sum);

		}
}