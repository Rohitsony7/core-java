abstract class Meth
{
	abstract void rollNo();
	abstract int sum(int a,int b);
	abstract void getPower(double a,double b);
	
	void showMe()
	{
		System.out.println("ShowMe called");
	}
}

abstract class Usemeth extends Meth
{
	@Override
	void rollNo()
	{
		System.out.println("1");
	}
	@Override
	int sum(int a,int b)
	{
		return a+b;
	}
	void call()
	{
		System.out.println("Call is called");
	}
}
class Usemeth1 extends Usemeth
{
	@Override
	void getPower(double a,double b)
	{
		System.out.println("Powers is:"+Math.pow(a,b));
	}
}
class DemoAbstract
{
	public static void main(String args[])
	{
		Usemeth1 d=new Usemeth1();
		d.rollNo();
		System.out.println("Sum is:"+d.sum(3,4));
		d.call();
		d.showMe();
		d.getPower(5,2.4);
	}
}