package importantpogram;

import java.util.HashSet;

public class DuplicateElementesinArray {
	
	public static void main(String[]args)
	{
		/*String arr[] = {"java","c","c++","python","Java"};
		
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("found duplicate element" + arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");	
		}*/
		
		// Approach :using hashset
		
		HashSet<String>lang = new HashSet();
		
		System.out.println(lang.add("java"));
		System.out.println(lang.add("c"));
		System.out.println(lang.add("python"));
		System.out.println(lang.add("c++"));
		System.out.println(lang.add("Java"));
		
		
	}

}
