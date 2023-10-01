package advancejava;

import java.util.Arrays;

public class Desending_arrays {
	
	public static void main(String[]args)
	{
		// Generate the numbers in code from 10-1
		int []n  = new int[10];
		n[0]=10;
		n[1]=9;
		n[2]=8;
		n[3]=7;
		n[4]=6;
		n[5]=5;
		n[6]=4;
		n[7]=3;
		n[8]=2;
		n[9]=1;
		
				
		Arrays.sort(n);
		System.out.println("Printing in Descending order");
		for(int i=n.length-1; i>=0; i--)
		{
			System.out.println(n[i]+"");
		}
	}

}

