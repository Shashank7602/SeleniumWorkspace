package day_7java;
abstract class animal
{
	abstract public void eat();
}
class herbivores extends animal
{
	public void eat()
	{
		System.out.println("herbivores eat greens");
	}
	
}
class omnivores extends animal
{
	public void eat()
	{
		System.out.println("omnivores eat both greens and flesh");
	}
	
}
class carnivores extends animal
{
	public void eat()
	{
		System.out.println("carnivores eat flesh");
	}
	
}

public class practice {

	public static void main(String args[])
	{
		animal obj1 = new herbivores();
		animal obj2 = new omnivores();
		animal obj3 = new carnivores();
		obj1.eat();
		obj2.eat();
		obj3.eat();
	}
}

