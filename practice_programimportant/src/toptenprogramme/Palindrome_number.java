package toptenprogramme;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
		int num;
		int a;
		int b=0;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		num = scan.nextInt();
		
		c=num;
		while(num>0)
		{
			a = num%10;
			b = b*10+a;
			num = num/10;
			
		}
		if(c==b)
		{
		
			System.out.println("this is palndrome number");	
		}
		
		else
		{
			System.out.println("this is not palndrome number");
		}

	}

}
