package advancejava;

public class Multiple_catchblock {

	public static void main(String[]args) {
		try
		{
			int a=10;
			int b=0;
			int c=a/b;

		}

		catch(ArithmeticException a) { //child 

			a.printStackTrace();
			System.out.println("hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("bye");
		}
	}
}
