class Demo
{
	class A // inner class
	{
		void f1()
		{
			System.out.println("f1 called");
		}
	}
	static class B //nested class
	{
		void f2()
		{
			System.out.println("f2 called");
		}
	}
	void show()
	{
		System.out.println("show called");
		
		class C
		{
			void f4()
			{
				System.out.println("F4 called");
				class d
				{
				}
				
			}
		}
		C obj=new C();
		obj.f4();
	}
	
}
class Demonestedinner
{
	public static void main(String args[])
	{
		Demo.B obj=new Demo.B();
		obj.f2();
		Demo d=new Demo();
		d.show();
		Demo.A oa=d.new A();
		oa.f1();
		
	}
}
			