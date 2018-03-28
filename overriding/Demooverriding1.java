class Meth
{
	void authorname()
	{
		System.out.println("Author name is Rohit Soni");
	}
	void f1()
	{
		System.out.println("F1 called");
	}
}
class Demo extends Meth
{
	@Override
	protected void authorname() //grether visibility then default,or u can us here public also
	{
		System.out.println("Book is created by Rohit_sony7");
	}
	void show()
	{
		System.out.println("Show Method Called");
	}
}
class Demooverriding1
{
	public static void main(String args[])
	{
		
		Meth m=new Demo();
		m.authorname();
		m.f1();
	Demo d=new Demo();
	d.show();
		
		
	}
}
	