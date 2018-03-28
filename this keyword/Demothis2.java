class Demo
{
	Demo()
	{	this(22,33);
		System.out.println("Default called");
	}
	Demo(int a,int b)
	{	this(2.3,4.5);
	
		System.out.println("int-int called");
	}
	Demo(double a,double b)
	{	
		System.out.println("Double double called");
	}
}
class Demothis2
{
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}