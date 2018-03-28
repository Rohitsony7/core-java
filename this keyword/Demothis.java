class Demo
{
	Demo()
	{
		System.out.println("this is"+this);
	}
}
class Demothis
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		System.out.println("d is:"+d);
		System.out.println("----------------");
		 
		Demo d1=new Demo();
		System.out.println("d1 i:"+d1);
	}
}