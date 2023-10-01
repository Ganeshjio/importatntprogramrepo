package toptenprogramme;

import java.util.Scanner;

public class Fabnious_series {

	public static void main(String[] args) {
		int num;
		int a=0;
		int b=1;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter nymber");
		num = scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(" "+ a);
			c = a+b;
			a = b;
			b = c;
			
		}

	}

}
