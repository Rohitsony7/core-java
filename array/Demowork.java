class Demowork
{
	public static void main(String args[])
	{
		int h=(int)(Math.random()*100);
		int s=(int)(Math.random()*100);
		int m=(int)(Math.random()*100);
		int e=(int)(Math.random()*100);
		int p=(int)(Math.random()*100);
		
		System.out.println("marks in hindi:"+h);
		System.out.println("marks in science:"+s);
		System.out.println("marks in math:"+m);
		System.out.println("marks in english:"+e);
		System.out.println("marks in physics:"+p);
	

		System.out.println("Total marks is:");
		int sum=0;
		sum=sum+h+m+e+p+s;
		System.out.println(sum);
		
		
		if(sum>400)
		{
			System.out.println("A grad");
		}
		else if(sum>300)
		{
			System.out.println("B grad");
		}
		else if(sum>200)
		{
			System.out.println("C grad");
		}
		else if(sum>100)
		{
			System.out.println("C grad");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}