class Atm
{
	Atm()
	{
		System.out.println("ATM class's object created ");
	}
	void trans(String tname)
	{
		System.out.println("Trans begin for:"+tname);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Trans ended for :"+tname);
	}
}
class Customer extends Thread
{
	Atm sh;
	Customer(String name,Atm sh)
	{
		super(name);
		this.sh=sh;
		start();
	}
	public void run()
	{
		synchronized(sh)
		{
			sh.trans(getName());
		}
	}
}
class Bank
{
	public static void main(String args[])
	{	
		Atm atm=new Atm();
		Customer c1=new Customer("1st",atm);
		Customer c2=new Customer("2nd",atm);
		Customer c3=new Customer("3rd",atm);
		Customer c4=new Customer("4th",atm);
	}
}

		