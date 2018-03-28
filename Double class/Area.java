class A
{
	int a=10;
	int b=20;
}
class B
{
	int a=30;
	int b=40;
}
class Area
{
		public static void main(String args[])
		{
			A oa=new A(); //from class A,object is oa
			System.out.println(oa.a+oa.b);
			B ob=new B();// from class B,object is ob
			System.out.println(ob.a+ob.b);
		}
}