package day_7java;

class Student1 {
    public String name;
    public int rollno;
    Student1(String s,int r)
    {
    	name = s;
    	rollno = r;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    } 
    public void setRollno(int rollno)
    {
    	this.rollno = rollno;
    }
    public int getRollno()
    {
    	return this.rollno;
    }
}
public class get_set {
	public static void main(String args[])
	{
		Student1 obj = new Student1("mandeep",11);
		String Stu_name = obj.getName();
		int Stu_rollno = obj.getRollno();
		System.out.println("Student name: "+Stu_name);
		System.out.println("Student Rollno: "+Stu_rollno);
	}

}
