class Demo
{
	 int a=10;
	static void show()
	{
		System.out.println("a is:"+Demo().a);
	}
}
class Demostatic
{
	public static void main(String args[])
	{
		Demo.show(); //call by class bcs of static method
	}
}