class DemoToCharArray
{
	public static void main(String args[])
	{
		String s=" hi this is rohit soni ";
		char ch[]=s.toCharArray();
		System.out.println(s.indexOf('h'));
		System.out.println(s.indexOf('s'));
		System.out.println(s.trim());
		System.out.println(s.charAt(5));



		for(char c:ch)
		{
			System.out.print(c+"|");
		}
		for(char i=0;i<622222;i++)
		{
			System.out.print(i);
		}
	}
}