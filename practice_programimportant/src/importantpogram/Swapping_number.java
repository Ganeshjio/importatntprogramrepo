package importantpogram;

public class Swapping_number {
	                                     //interchanging the value of varible 
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		System.out.println("before swapping value are:"+a+" "+b);
		//using third varible(tempary varible)
		int t=a;
		a=b;
		b=t; 
		System.out.println("after swapping value are:"+a+" "+b);
		
		//logic 2 without using third varible
		
		//a=a+b;  //10+20=30(current value a is 30)
		//b=a-b;  //10-20=10(current value b is 10)
		//a=a-b; //30-10=20(current value a is 20)
		
		/*logic 3 using multiplication and without using third varible
		a=a*b; //10*20=200(current value a is 200)
		b=a/b; //200/20=10(current value b is 10)   //a=20, b=10
		a=a/b; //200/10=20(current value b is 20) 
		*/
		//logic 4 using bitwise xor  10-(1010) , 20-(10100), 30(11110)
		//a=a^b; //30(11110)
		//b=a^b;//10(1010)     //that is a=20,b=10
		//a=a^b; //20(10100)
		
		//logic 5 using single statement
		//b=a+b-(a=b);  // b value assign a value
		//b=10+20-(20)
		//b=30-20=10// this is value b   //a=20, b=10
		
	}

}
