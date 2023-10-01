package advancejava;

import java.util.Arrays;

public class Desending_string {

	public static void main(String[] args) {
		
        String []a = new String[5];
        a[0] = "mumbai";
        a[1] = "pune";
        a[2] = "aurangabad";
        a[3] = "nashik";
        a[4] = "yermala";
        
        Arrays.sort(a);
        System.out.println("Printing in Descending order");
        for(int i=a.length-1;i>=0; i--)
        {
        	System.out.println(a[i]+"");
        }
	}

}
