class Meth
{
	void getpower(double a,double b)
	{
		System.out.println("Power is:"+Math.pow(a,b));
	}
	void getsqrt(int a)
	{
		System.out.println("Square is:"+Math.sqrt(a));
	}
	void calc(int a,int b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	void authorname()
	{
		System.out.println("Book is created by Rohit soni");
	}
}
class Demo extends Meth
{
	@Override
	void calc(int a,int b)
	{
		System.out.println("multiply is:"+(a*b));
	}
	@Override
	void authorname()
	{
		System.out.println("created by me");
		super.authorname();
	}
	void show()
	{
		System.out.println("Show fn called\"");
	}
}
class Demooverriding
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.getpower(2,10);
		d.getsqrt(625);
		d.calc(5,6);
		d.authorname();
		d.show();
	}
}
