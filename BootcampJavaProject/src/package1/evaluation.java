package package1;
abstract class Bank
{
	abstract public void getbalance();
}
class BankA extends Bank
{
	public void getbalance()
	{
		System.out.println("$100");
	}
}
class BankB extends Bank
{
	 public void getbalance()
	{
		System.out.println("$200");
	}
}
class BankC extends Bank
{
	public void getbalance()
	{
		System.out.println("$500");
	}
}
public class evaluation {
	public static void main(String args[])
	{
		BankA obj1 = new BankA();
		BankB obj2 = new BankB();
		BankC obj3 = new BankC();
		obj1.getbalance();
		obj2.getbalance();
		obj3.getbalance();
	}

}
