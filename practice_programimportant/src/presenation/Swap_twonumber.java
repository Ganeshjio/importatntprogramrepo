package presenation;

public class Swap_twonumber {
	
	public static void main(String[]args)
	{
	int a=10;
	int b=20;
	
	
	System.out.println("before swaping value are=" +a +" " + b);
	/*
	int c = a;//10
	a = b;  //20
	b =c;  //10
	*/
	a = a*b;  //10+20=30
	b = a/b;  //30-20=10
	a = a/b;  //30-10=20
	
	 System.out.println("After swaping value are=" + a + " "+ b);
	    
	

}

}
