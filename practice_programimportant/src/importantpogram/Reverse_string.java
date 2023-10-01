package importantpogram;

public class Reverse_string {
	
	public static void main(String[]args)
	{
		// using + (string cocatenation) opertor
		String str = "ABCDHTYR";
		String rev ="";
		
		int length = str.length();  //4  
		
		//str.charAt(0);
		
		for (int i=length-1; i>=0; i--)  //3 2 1 0
		{
			rev = rev+str.charAt(i); //DCBA         //index always start zero(0)
		}
		
		System.out.println("Revered string is = "+ rev);
	}

}
