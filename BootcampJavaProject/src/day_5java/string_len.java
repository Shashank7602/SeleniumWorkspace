package day_5java;

public class string_len {
	public static void main(String args[])
	{
		String str = "welcome";
		String str1 = "Welcome";
		String str2 = "    Welcome    ";
		String str3="Java";
		String str4 ="Python";
		String str5="Java";
		StringBuffer str6= new StringBuffer("welcome");
		System.out.println(str.length());
		System.out.println(str.indexOf("e",3));
		System.out.println(str.charAt(5));
		System.out.println(str.replace("e", "k"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str4.compareTo(str3));
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareTo(str5));
		System.out.println(str2.trim());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
		System.out.println(str6.append("hi"));
		System.out.println(str6.insert(2, "hi"));
		System.out.println(str6.delete(2,4));
		System.out.println(str6.substring(2,5));
		System.out.println(str6.subSequence(2,5));
		
		
		
		
		
	}

}
