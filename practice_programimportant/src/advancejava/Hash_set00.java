package advancejava;

import java.util.HashSet;

public class Hash_set00 {

	public static void main(String[] args) {
		
	 	//Duplicates are not allowed.
	 	//Allows only 1 null value.
	 	//Order of insertion is not maintained (i.e  Random).
	 	//Default capacity of HashSet is 16 and load factor is 0.75.

		HashSet h = new HashSet();  
		
		h.add("James");
		h.add(100);
		h.add('D');
		h.add(90.3);
		h.add(100);
		h.add(null);
		h.add(null);
	

      System.out.println(h);
      
      // get the size value
      System.out.println(h.size());
      
      //printing value of patricular index
      
      System.out.println(h.contains(100));
      
      System.out.println(h.contains(80)); 
      
      //to check for if it is empty
      System.out.println(h.isEmpty());
      
      // to remove value a particular a value
      
      h.remove(4);
      System.out.println(h);
      
      h.remove(null);
      System.out.println(h);
      
      // to delete all records
      
      h.clear();
      System.out.println(h);
      
      
	}

}
