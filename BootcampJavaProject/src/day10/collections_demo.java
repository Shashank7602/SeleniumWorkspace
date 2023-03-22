package day10;
import java.util.*;
public class collections_demo {

	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>(List.of(10,20,30,40,50,60));
		LinkedHashSet<Integer> al3 = new LinkedHashSet<>(al2);
		System.out.println(al3);
		System.out.println(al1.add(10));
		al1.add(0,5);
		al1.addAll(al2);
		al1.retainAll(al2);
		System.out.println(al1);
		al1.removeAll(al2);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al1.contains(100));
		System.out.println(al1.containsAll(al2));
		al1.clear();
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.equals(al2));
		System.out.println(al1.iterator());
		
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));
		}
	}
}

