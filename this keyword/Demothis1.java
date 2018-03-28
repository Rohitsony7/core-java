class Demo
{
	int a=10;
	Demo() // constructor
	{
		int a=90;
		System.out.println("Value of a with this:"+this.a);
		System.out.println("value of a is :"+a);

	}
	void show()
	{
		System.out.println("value of a is :"+a);
	}
}
class Demothis1
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.show();
	}
}