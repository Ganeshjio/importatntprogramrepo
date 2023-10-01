package toptenprogramme;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		
		int num ;
		int a ;
		int b =0;
		int c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		num = scan.nextInt();
		
		c=num;
		while(num>0)
		{
			  a = num%10;
			  b = b+(a*a*a);
			  num = num/10;
			  	 
		}
		 if(c==b)
		  {
			  System.out.println("this is armstrong number");
		  }
		  
		  else {
			  System.out.println("this is not armstrong number");
			 
		  }
		

	}

}
