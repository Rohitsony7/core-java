class Superclass
{
	int i;
	static
	{
		System.out.println("SUPERCLASS static called");
	}
	Superclass()
	{
		i=10;
		System.out.println("Value of i is:"+i);
	}
}
class Subclass extends Superclass
{
	int j;
	static
	{
		System.out.println("SUBCLASS Static called");
	}
	Subclass()
	{	j=20;
		System.out.println("value of j is:"+j);
	}
	public static void main(String args[])
	{
		new Subclass();
	}
}