package toptenprogramme;

public class Factroial_number {

	public static void main(String[] args) {
		double num =5;
		double fact=1;
		
		for(double i=1;i<=num;i++)   //mathematical operation of multiplying a no. with all the smaller no.
		{
			fact = fact*i;
			
		System.out.println("factorial number is =" + fact);
		}
	}

}
