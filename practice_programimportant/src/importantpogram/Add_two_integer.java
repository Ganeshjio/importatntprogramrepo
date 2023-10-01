package importantpogram;

import java.util.Scanner;

public class Add_two_integer {
	                                         // java program to Add two integer
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the value of a=");
		int a = scan.nextInt();

		System.out.println("enter the valur of b=");
		int b = scan.nextInt();
	
		
		int sum = a+b;
		System.out.println(sum);
		
	}

}
