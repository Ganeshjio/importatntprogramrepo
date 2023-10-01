package advancejava;

import java.io.FileInputStream;

public class Exepection_handling {
	
	public static void main(String[]args)
	{
		try
		{
			FileInputStream F  = new FileInputStream("C:\\mno.txt");
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
