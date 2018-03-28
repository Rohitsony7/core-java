class Demo
{
	int a;
	int b;
}
class Sum
{
	public static void main(String args[])
	{
		Demo o=new Demo();
		System.out.println(o);
		o.a=10;
		o.b=20;
		System.out.println("Sum is:"+(o.a+o.b));
		
		Demo d=new Demo();
		System.out.println(d);
		System.out.println(d.a+d.b);
	}
}
		