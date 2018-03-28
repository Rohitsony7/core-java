class Myclass1
{
	Myclass1(int a,int b)
	{
		System.out.println("counstructor called");
	}
	void Myclass1()
	{
		System.out.println("Method called");
	}
}
class Democons1
{
	public static void main(String args[])
	{
		Myclass1 d=new Myclass1(12,13);
		d.Myclass1();
	
	}
}
		