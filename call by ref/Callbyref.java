class Demo
{
	int a=10;
	int b=20;
	 
		Demo()
		{
			System.out.println("object created");
		}
}
class A
{
	A(Demo d)
	{
		System.out.println("sum is:"+(d.a+d.b));
		System.out.println(d);

	}
}
class B
{
	B(Demo d1)
	{
		System.out.println("multiply is:"+(d1.a*d1.b));
		System.out.println(d1);
		System.out.println(d1);

	}
}
class Callbyref
{
	public static void main(String args[])
	{
		Demo demo=new Demo();
		System.out.println(demo);
		A oa=new A(demo);
		B ob=new B(demo);
	}
}
		
	