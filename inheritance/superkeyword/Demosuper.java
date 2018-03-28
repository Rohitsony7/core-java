class A
{
	A()
	{
		System.out.println("A cons called");
	}
}
class B extends A
{
	B()
	{	
		System.out.println("B cons called");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C cons called");
	}
}
class Demosuper
{
	public static void main(String args[])
	{
		new C();
	}
}