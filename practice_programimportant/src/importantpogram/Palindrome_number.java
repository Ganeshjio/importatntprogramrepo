package importantpogram;

import java.util.Scanner;

public class Palindrome_number {
	
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int num = scan.nextInt();
	
	int org=num;
	
	int rev=0;
	int p;
	while(num>0) {  //(num!=0)
	
	rev=rev*10+num%10;  //rev=121%10=1 //120+12%10=120+2=122  // p=num%10  //rev=rev*10+p//num=num/10
	num=num/10;  //121/10=12//12/10=1
}
    if(org==rev)
    {
    	System.out.println("org palindrome number="+org);
    }
    else
    {
    	System.out.println("org not palindrome number="+org);
    }
	
}
}
