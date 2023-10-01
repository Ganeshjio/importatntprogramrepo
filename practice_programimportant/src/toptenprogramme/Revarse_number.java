package toptenprogramme;

import java.util.Scanner;

public class Revarse_number {

	public static void main(String[] args) {
	
		int num;
		int a;
		int b=0;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		num = scan.nextInt();
		
		while(num>0)
		{
			a = num%10;
			b = b*10+a;
			num = num/10;
		}
		System.out.println("revarse number is=" +b);
		
	}

}
