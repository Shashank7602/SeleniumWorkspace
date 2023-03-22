package day_8;
class Employee
{ 
	int salary,hours;
	public int getinfo( int sal, int h)
	{
		salary = sal;
		hours = h;
	    return salary;
		
	}
	public void  addBonus()
	{
		if(salary < 600)
		{
			salary = salary+15;
			System.out.println(salary);
		}
	
		
	}
	public void addWork()
	{
		if(hours>8)
		{
			salary = salary+10;
			System.out.println(salary);
		}
	}
	
}
public class Employee_demo {
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.getinfo(150,5);
		obj.addBonus();
		obj.addWork();
	}
}


