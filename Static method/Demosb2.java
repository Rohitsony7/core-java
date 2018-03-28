class Demosb2
{	Demosb2()
	{
		System.out.println("cons called");
	}
	{
		System.out.println("init called");
	}
	static
	{
		System.out.println("Static 1 called");
	}
	public static   void main(String args[])
	{
		System.out.println("Main method called");
		new Demosb2();
	}
	static 
	{
		System.out.println("Static 2 called");
	}
}