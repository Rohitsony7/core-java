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
		String s=new String("Anushree");
		int i=s.length();
		System.out.println(i);
		String s1=new String("Rohit");
		System.out.println(+s.compareTo(s1));
		System.out.println(s.startsWith("A")+" | "+s.endsWith("e"));
		System.out.println(s.charAt(5));
		System.out.println(s.substring(3,8));
		



		

	
	}
}