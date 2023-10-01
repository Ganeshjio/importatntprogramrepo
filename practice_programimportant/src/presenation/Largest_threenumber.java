package presenation;

import java.util.Scanner;

public class Largest_threenumber {
	
	public static void main(String[]args)
	{
		int a;
		int b;
		int c;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter a first number");
	     a = scan.nextInt();
	     
	 	System.out.println("enter a second number");
	 	b = scan.nextInt();
	 	
		System.out.println("enter a third number");
		c = scan.nextInt();
	     
		if (a>b && a>c)
		{
			System.out.println("a is largest number="+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest number="+b);
		}
		
		else
		{
			System.out.println("c is largest number="+c);
		}
	}

}
