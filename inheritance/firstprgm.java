class A
{
	private int a;
	private int b;
	void Setvalues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int sum()
	{
		System.out.println("Sum is :"+(a+b));
		return a+b;
		
	}
}
class B extends A
{
	int c;
	void sumAll()
	{	System.out.println("--------");
		System.out.println("Sum all is:"+(sum()+c));
	}
}
class firstprgm
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.Setvalues(20,30);
		ob.c=30;
		ob.sumAll();
	}
}