class Myclass
{
	Myclass()
	{
		System.out.println("counstructor called");
	}
	void Myclass()
	{
		System.out.println("Method called");
	}
}
class Democons
{
	public static void main(String args[])
	{
		Myclass d=new Myclass();
		d.Myclass();
		
	
	}
}
		