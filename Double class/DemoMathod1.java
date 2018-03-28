class room
{
	double area(double a,double b)
	{
		return a*b;
	}
	double vol(double a,double b,double c)
	{
		return a*b*c;
	}
}
class DemoMethod1
{
	public static void main(String args[])
	{
		room d=new room();
		System.out.println("Area is:"+d.area(30.45,55.86));
		System.out.println("Vol is:"+d.vol(32.45,45.44,54.35));
	}
}

