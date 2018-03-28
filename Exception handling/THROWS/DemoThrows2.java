class Demo
{
	void getInput()throws Exception
	{
		System.out.println("enter char");
		char ch=(char)System.in.read();
		System.out.println("Enterd char is:"+ch);
	}
}
class DemoThrows2
{
	public static void main(String args[])throws Exception
	{
		Demo d=new Demo();
		d.getInput();
		System.out.println("E.O.P");
	}
}