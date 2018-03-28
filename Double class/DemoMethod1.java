class room
{
	int area(double a,double b)
	{
		return (int)(a*b);
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
		System.out.println("Vol is:"+d.vol(45.66,54.55,43.56));
	}
}
