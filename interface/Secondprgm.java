interface Test
{
	int roll_no=1;
	void sum(int a,int b);
	void getPower(double a,double b);
	static void f1()
	{
		System.out.println("Static method f1 called");
	}
	default void f2()
	{
		System.out.println("f2 called");
	}
}
class Student implements Test
{
	@Override
	public void sum(int a,int b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	@Override
	public void getPower(double a,double b)
	{
		System.out.println("GEtPower is:)"+Math.pow(a,b));
	}
	void show()
	{
		System.out.println("ROll no is:"+roll_no);
	}
}
class Secondprgm
{	public static void main(String args[])
	{
	Student s=new Student();
	s.getPower(5,2);
	s.sum(300,440);
	s.show();
	System.out.println("Roll no is:"+Test.roll_no);
	Test.f1();
	
	s.f2();
	}
}
