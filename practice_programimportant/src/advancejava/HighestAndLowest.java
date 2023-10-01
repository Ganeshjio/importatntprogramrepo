package advancejava;

public class HighestAndLowest {
	
public static void main(String[] args) {
		
		int high;
		int low;
		
		int a[]= new int[5];
		a[0]=2;
		a[1]=1;
		a[2]=4;
		a[3]=5;
		a[4]=3;
		
		high = a[0]; //assume the first element is highest
		low = a[0]; //assume first elemmt is low
		
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > high) //2>2..1>2..4>2
			{
				high = a[i];         //high =5
			}
			
			
			if(a[i]< low)//2<2..1<2....4<1
			{
				low = a[i];                          //low =1
			}
		}
		
		System.out.println("Highest value is = " + high);
		System.out.println("Lowest value is = " + low);
			
	

	}

}


