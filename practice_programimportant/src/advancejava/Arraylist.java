package advancejava;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		//	Duplicates are allowed.
		//	Allows any number of null values.
		//	Order of insertion is maintained.
		//	Default capacity of arraylist is 10.
		//	Arraylist is resizable.

		ArrayList k = new ArrayList();
		
		k.add('p');
		k.add(500);
		k.add(null);
		k.add(500);
		k.add(null);
		k.add("abc");
		
		System.out.println(k);
		
		//get the size
		
		System.out.println(k.size());
		
		//printing value at particular index
		
		System.out.println(k.get(2));
		
		//printing value at particular index
		
		k.set(2,'p');
		System.out.println(k);
		
		// remove a value a particular index
		
		k.remove(5);
	
		System.out.println(k);
		
		// to check a vlaue
		
		System.out.println(k.contains("abc"));
		
		// to check if it is empty for not
		
		System.out.println(k.isEmpty());
		
		// to delete all recorde
		
		k.clear();
		System.out.println(k);
		
		
		

	}

}
