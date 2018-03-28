class Demo1
{
	int[] value()
	{
		int arr[]={21,343,545,667,876,443,863};
		return arr;
	}
}
class UseDemo2
{
	public static void main(String args[])
	{
		Demo1 obj=new Demo1();
		int a[]=obj.value();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}
}