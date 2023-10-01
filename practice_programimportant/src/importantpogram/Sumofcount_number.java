package importantpogram;

public class Sumofcount_number {
	
	public static void main(String[]args)
	{
		int num =1248;
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+num%10;  //0+1248%10=8//124%10=8+4//12%10=12+2//1%10=8+4+2+1=15
			num = num/10;      //1248/10=124//124/10=12//12/10=1//1/10=0 this condition is false
			
		}
		
		System.out.println("sum of digits number="+sum);
	
	}

}
