class A
{
	int a=10;
}
class B extends A
{
	//int a=20;
	void show()
	{
		//int a=90;
		System.out.println("Super.a is:"+super.a);
		System.out.println("this keyword is:"+this.a);
		System.out.println("a is:"+a);
	}
}
class Secondprgm
{
	public static void main(String args[])
	{
		new B().show();
	}
}
		