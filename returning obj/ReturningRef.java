class Demo
{
	Demo()
	{
		System.out.println("Default cons called");
	}
	Demo show() //return ref of class Demo
	{
		System.out.println("Show method called");
		return this; //ref return of Demo class
	}
	Demo showme()
	{
		System.out.println("Show me method called");
		return this;
	}
	A call()
	{
		System.out.println("pls call me");
		return new A();
	}
	}

	class A
	{
		void f1()
		{
			System.out.println("F1 called");
		}
	}
	class ReturningRef
	{
		public static void main(String args[])
		{
			new Demo().show().showme().call().f1();
		}
	}
			
		