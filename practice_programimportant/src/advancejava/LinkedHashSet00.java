package advancejava;

import java.util.LinkedHashSet;

public class LinkedHashSet00 {

	public static void main(String[]args)
	{
		// 	Duplicates are not allowed.
	 	//Allows only 1 null value.
		
		LinkedHashSet z = new LinkedHashSet();
		
		z.add('o');
		z.add("om");
		z.add(null);
		z.add(170);
		z.add(null);
		z.add(170);
		z.add(80.3);
		
		System.out.println(z);
		// printing value  a particular index
		
		System.out.println(z.contains(null));
		
		// printing value  a particular index
		System.out.println(z.size());
		
		//to check a value
		System.out.println(z.contains(40));
		
		// to check if it is empty for not
		
				System.out.println(z.isEmpty());
				
				// to delete all record
				
				z.clear();
				
				System.out.println(z);
		
		
	}
}
