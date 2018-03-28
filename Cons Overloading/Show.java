class Meth
{
	Meth()
	{
		System.out.println("Default cons called");
	}
	Meth(int a,int b)
	{
		System.out.println("int int called");
	}
	Meth(double a,double b,double c)
	{
		System.out.println("Double double double called");
	}
	Meth(double a,double b)
	{
		System.out.println("double double called");
	}
}
class Show
{
	public static void main(String args[])
	{
		Meth b=new Meth();
		new Meth(1.0,2);
		new Meth(1.2,2.4);
		new Meth(1.2,3,1.4);
	}
}