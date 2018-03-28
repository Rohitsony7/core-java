class Demo
{
	String fullname(String a,String b)
	{
		return a+b;
	}
	boolean equal(int a,int b)
	{
		return a==b;
	}
	
	char show()
	{
		return 'A';
	}
}
	
class Demomathod2
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		System.out.println("Full name:"+d.fullname("ROHIT"," SONI"));
		System.out.println("Boolean:"+d.equal(45,45));
		System.out.println("show:"+d.show());
	}
}


