class Demo
{
	Demo()
	{
		System.out.println("Default cons called");
	}
	

	Demo Show()
	{
		System.out.println("Show called");
		return this;
	}
	
	A Showme()
	{
		System.out.println("showme called");
		return new A();
	}
	
	C Showmetoo()
	{
		System.out.println("Showme too fn called");
		return new C();
	}

}
class A
{
	B f1()
	{
		System.out.println("F1 called");
		return new B();
	}
	
	C call()
	{
		System.out.println("call called");
		return new C();
	}
}

class B
{
	A f2()
	{
		System.out.println("F2 called");
		return new A();
	}
	B callme()
	{
		System.out.println("Callme  called");
		return this;
	}
}
class C
{
	Demo f3()
	{
		System.out.println("F3 called");
		return new Demo();
	}
	void callmetoo()
	{
		System.out.println("Callmetoo called");
	}
}
	class ReturningRef1
{
	public static void main(String args[])
	{
		new Demo().Show().Showme().f1().callme().f2().call().f3().Showmetoo().callmetoo();
	}
}				