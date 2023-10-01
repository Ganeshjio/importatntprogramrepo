package advancejava;

import java.util.TreeSet;

public class Treeset00 {
	

		public static void main(String[] args) {
		
			TreeSet t = new TreeSet();
		
			t.add("a");
			t.add("F");
			t.add("D");
			//t.add(10);
			t.add("K");
			t.add("Z");
			t.add("A");
			System.out.println(t);
			
			System.out.println(t.pollFirst());
			System.out.println(t.pollLast());
			
		/*	t.add(3);
			t.add(2);
			t.add(1);
			t.add(5);
			t.add(9);
			t.add(10);
	         System.out.println(t);
	         
	      */   
		}

	}
	

