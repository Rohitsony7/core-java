class calc
{
	void sum(int a,int b)
	{
		System.out.println("Sum is:"+(a+b));
	}
	int multi(int a,int b)
	{	
		System.out.println("Multiplication is");
		return a*b;
	}
}
class DemoMathod
{
	public static void main(String args[])
	{
		calc d=new calc();
		d.sum(40,30);
		int result=d.multi(30,40);
		System.out.println(result);
		 System.out.println("Result is:"+d.multi(19,100));
	}
}


		