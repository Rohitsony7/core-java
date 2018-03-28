interface Test
 {
	void getFloor(double a);
	void rollNo();
}
interface Test1
{
	void getCeil(double a);
	void rollNo();
}
class Student implements Test,Test1
{
	public void getFloor(double a)
	{
		System.out.println(+Math.floor(a));
	}
	public void getCeil(double a)
	{
		System.out.println(+Math.ceil(a));
	}
	public void rollNo()
	{
		System.out.println("one");
	}
}
class Thirdprgm
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.getFloor(7.6);
		s.getCeil(7.6);
		s.rollNo();
	}
}