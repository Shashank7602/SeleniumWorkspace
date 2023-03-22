package day10;
import java.util.*;
public class hash_demo {

	public static void main (String args[])
	{
		HashMap<Integer,String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
		tm.put(3,"D");
		tm.put(4,"E");
		tm.put(5, "F");
		System.out.println(tm);
		if(tm.containsValue("E"))
		{
			System.out.println("value is present");
		}
		else
		{
			System.out.println("value is not present");
		}
	}
}
