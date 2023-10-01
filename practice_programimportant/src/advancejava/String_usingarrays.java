package advancejava;

import java.util.Arrays;

public class String_usingarrays {

	public static void main(String[] args) {
		
		String []w = new String[5];
		
		w[0]= "yash";
		w[1]= "ganesh";
		w[2]= "pooja";
		w[3]= "durga";
		w[4]= "arjun";

		Arrays.sort(w);
		System.out.println("Printing in Ascending order by string");
		for(int i=0; i<=w.length-1;i++)
		{
			System.out.println(w[i]);
		}
	}

}
