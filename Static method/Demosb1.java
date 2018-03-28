class Demo
{
	Demo()
	{
		System.out.println("Default cons called");
	}
	static
	{
		System.out.println("Demo's static called");
	}
	{
		System.out.println("init. block called");
	}
	void show()
	{
		System.out.println("Show called");
	}
}
class Demosb1
{
	static
	{
		System.out.println("Static block1 called");
	}
	public static void main(String args[])
	{
		System.out.println("main  method called");
		new Demo().show();
		System.out.println("-----------");
		new Demo();
	}
	static
	{
		System.out.println("static block2 called");
	}
}
		