package importantpogram;

//import java.util.Scanner;

public class Largest_3number {
	
	public static void main(String[]args)
	{
		int a=20;  // using without scanner
		 int b=60;
		 int c=100;
		
		
		/*Scanner scan = new Scanner(System.in);  //use in if and (and logic)
		
		System.out.println("enter the first number");
		int a = scan.nextInt();
		
		System.out.println("enter the second number");
		int b = scan.nextInt();
		
		System.out.println("enter the third number");
		int c = scan.nextInt();*/
		
		// three condition
		
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is  largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}
		
	}

}
