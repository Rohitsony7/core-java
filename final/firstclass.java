class Demo
{
	final int num;
	Demo()
	{
		num=20;
	}
	void show()
	{
		System.out.println("No. of Student is:"+num);
	}
}
class firstclass
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.num=200;
		d.show();
	}
}