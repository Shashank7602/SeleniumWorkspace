package assignment13;

public class complex {
	int real, imaginary;
	complex (int r, int i)
	{
	real = r;
	imaginary = i;
	}
	complex addComp (complex C1, complex C2)
	{
	complex temp = new complex(0,0);
	temp.real = C1.real + C2.real;
	temp.imaginary = C1.imaginary + C2.imaginary;
	return temp;
	}
	public static void main (String args [])
	{
	complex C1 = new complex (10 , 2);
	System.out.println ("Complex Number 1 :" + C1.real + "+ i" + C1.imaginary);
	complex C2 = new complex (9 , 5);
	System.out.println ("complex Number 2 : " + C2.real + "+ i" + C2.imaginary);
	complex C3 = new complex(0,0);
	C3 = C3.addComp(C1, C2);
	System.out.println ("Sum of the complex numbers is : " + C3.real + " + i" + C3.imaginary);
	}
	}
	