class Demo
{
	void sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		 System.out.println(sum);
	}
}
class UseDemo1
{
	public static void main(String args[])
	{
		int a[]={22,33,44,55,66,77,88,99};
		Demo d=new Demo();
		d.sum(a);
	}
}