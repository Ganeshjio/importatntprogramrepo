package importantpogram;

public class Counte_even_odd_number {

	public static void main(String[]args)
	{
		int num =123457;
		int even_count =0;
		int odd_count =0;

		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;	
			}

			num=num/10;

		}

		System.out.println("number of even "+even_count);
		System.out.println("number of odd "+odd_count);
	}

}
