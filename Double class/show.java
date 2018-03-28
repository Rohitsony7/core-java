class Demo
{
	String fullname(string first,string second)
	{
		return "first"+"second";
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
	
class Show
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		System.out.println("Full Name:"+d.fullname("Rohit", "soni"));
		System.out.println("Boolean:"+d.equal(45,45));
		System.out.println("show:"+d.show());
	}
}


