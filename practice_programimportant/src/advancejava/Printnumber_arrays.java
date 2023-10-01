package advancejava;

import java.util.Arrays;

public class Printnumber_arrays {
	public static void main(String[] args) {
		// Print the number from 1-10

		int i;
		for (i=1; i<11; i++) {
			System.out.println(i);
		}
		// Generate the numbers in code from 1-10
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		int g = 7;
		int h = 8;
		int j = 9;
		int k = 10;
		//		System.out.println(a);
		//		System.out.println(b);
		//		System.out.println(c);


		int [] n = new int[10];
		n[0]=6;
		n[1]=4;
		n[2]=9;
		n[3]=10;
		n[4]=8;
		n[5]=7;
		n[6]=5;
		n[7]=1;
		n[8]=3;
		n[9]=2;

		for (int v=0; v<n.length; v++) {
			//n[v] = v+1;
			System.out.println(n[v]);
		}
		Arrays.sort(n);
		System.out.println("Printing in Ascending order");
		for(int r =0; r<=n.length-1; r++) {
			System.out.println(n[r]);
		}

		// Verify the logo of Actitime is displayed on the home page of application or not
		// How much automation we need to perform?
		// How much webelement we need to automate - 5;
		// How many webpages we nedd to handle - 2;
		// URL, un, pwd, 
		// POM
		// Page Object Module
		
		

	}


}
