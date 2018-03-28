final class Demo
{
	 void autherName()
	{
		System.out.println("Ro-Hit Soni");
	}
}
class Demo1 extends Demo
{
	@Override
	void autherName()
	{
		System.out.println("Ro-Hit Soni1");
	}
}
class SecondUse
{
	public static void main(String args[])
	{
		Demo1 d=new Demo1();
		d.autherName();
	}
}