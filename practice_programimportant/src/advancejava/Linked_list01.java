package advancejava;

import java.util.LinkedList;

public class Linked_list01 {

	public static void main(String[]args) {
		
		//Duplicates are allowed.
		// Allows any number of null values.
		// Order of insertion is maintained.
		// Does not have a default capacity

		LinkedList v = new LinkedList ();
		
		v.add('p');
		v.add(500);
		v.add(null);
		v.add(500);
		v.add(null);
		v.add("abc");
		
		
		System.out.println(v);
		
		//get the size
		
		System.out.println(v.size());
		
		//printing value at a particular index
		
		System.out.println(v.get(2));
		
		//printing value at a particular index
		
		v.set(1, "abc");
		System.out.println(v);
		
		//remove a vllue at a particular index
		
		v.remove(5);
		System.out.println(v);
		
		//to check a value
		
		System.out.println(v.contains("abc"));
		

		//to check if it is empty for not
		System.out.println(v.isEmpty());
		
		//delete v recorde
		
		v.clear();
		System.out.println(v);

		
	}

}
