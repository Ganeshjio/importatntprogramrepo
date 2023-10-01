package importantpogram;

import java.util.Scanner;

public class Print_evenandodd {
	
	int k;
	
	public void m1()
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.println("enter number");
	   k= scan.nextInt();
	   
	   if( k>=1100 &&  k<=1900)
	   {
		   if( (k%2)==0)
		   {
			   System.out.println("print even number");  
		   }
	   
	   
		   else if(k%2!=0) {
			   
		   System.out.println("print odd number");
	   }
		   
	   }
	   
		   else {
			   
			   System.out.println("invalid number");
		   }
	}

	  

  public static void main(String[]args)
  {
	  Print_evenandodd v = new Print_evenandodd();
	  v.m1();
  }
}
