package day10;

import java.util.*;
//import java.util.List;

public class commom_elements {
	public static void main(String args[])
	{
		ArrayList<Integer> al1 = new ArrayList<>(List.of(12,10,45,50,30));
		ArrayList<Integer> al2 = new ArrayList<>(List.of(10,20,30,40,50));
		al1.retainAll(al2);
		System.out.println(al1);
		for(int i=0;i<al1.size();i++)
		{ 
			for(int j=0;j<al2.size();j++)
			{
				if(al1.get(i)==al2.get(j)) 
				{
					System.out.println(al1.get(i));
					break;
				}

			}
			
		}	
}
}
