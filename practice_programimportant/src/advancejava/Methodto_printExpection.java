package advancejava;

public class Methodto_printExpection {
	
	public static void main(String[]args)
	{
		try {
		int a=20;
		int b=0;
		int c=a/b;
		
	}
		catch (Exception e)
		{
			e.printStackTrace();  //best and preferred 
			System.out.println(e);  //exception name
			
			System.out.println(e.getMessage());  //description
			                     
		}                        
		
		
}
}

		
	
	










