class A
{
	int l,b,area;
	void showarea()
	{	 area=l*b;
		System.out.println("Area is:"+area);
		//System.out.println(l+","+b);
	}
}
class rectangle extends A
{
	rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	 void square(int l)
	{
		l=l; //if this.l=l; than ans is 625
		b=l;
		
	}
}


class Inheritance
{
	public static void main(String args[])
	{	
	rectangle rect=new rectangle(10,20);
	rect.showarea();
	rect.square(25);
	rect.showarea();
	
	
	
	}
}