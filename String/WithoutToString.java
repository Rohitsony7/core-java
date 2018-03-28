class Demo
{
	public String toString()
	{
		return "Overridden to string";
	}
}
public class WithToString
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		System.out.println(d);
	}
}