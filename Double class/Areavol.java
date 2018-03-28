class Room
{
	void area(int l,int h)
	{
		System.out.println("aarea is;"+(l*h));
	}
	void volume(int l,int h, int b)
	{
		System.out.println("Volume is:"+(l*b*h));
	}
}

class Areavol
{
	public static void main(String args[])
	{
		for(int n=0;n<10;n++)
		{
		int x=(int)(Math.random()*100);
			int y=(int)(Math.random()*100);
				int z =(int)(Math.random()*100);
		
		Room r =new Room();
		System.out.println(r);
		r.area(x,y);
		r.volume(x,y,z);
		} 
		 
	}
}