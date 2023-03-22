package day_8;
class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(number);
	    System.out.println(address);
	    
	  }

	}

	class Employee5 extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	}



public class ques9 {
	public static void main(String[] args) {
		Employee5 obj1 = new Employee5();
	    obj1.name = "Mandeep";
	    obj1.age = 22;
	    obj1.number = "12345678";
	    obj1.address = "Chandigarh";
	    obj1.salary = 20000;
	    obj1.specialization = "QE";
	    System.out.println("Employee details: ");
	    obj1.printSalary();
	    System.out.println(obj1.specialization);
	    System.out.println(" ");
	    
	    Manager obj2 = new Manager();
	    obj2.name = "Deep";
	    obj2.age = 23;
	    obj2.number = "87654321";
	    obj2.address = "Jalandhar";
	    obj2.salary = 30000;
	    obj2.department = "Testing";
	    System.out.println("Manager details:");
	    obj2.printSalary();
	    System.out.println(obj2.department);
	    

    }

}
