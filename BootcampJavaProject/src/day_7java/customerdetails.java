package day_7java;

public class customerdetails {

	String name;
	int c_id;
	customerdetails(String s,int id)
	{
		name = s;
		c_id = id;
	}
	public void showdetails()
	{
		System.out.println("customer name: "+name+" customer id: "+c_id);
		System.out.println();
	}
	public static void main(String args[])
	{
		customerdetails obj[]=new customerdetails[3];
		obj[0]= new customerdetails("abc",100);
		obj[1]=new customerdetails("xyz",200);
		obj[2]=new customerdetails("pqr",300);
		System.out.println("Customer1: ");
		obj[0].showdetails();
		System.out.println("Customer2: ");
		obj[1].showdetails();
		System.out.println("Customer3: ");
		obj[2].showdetails();
	}
}
