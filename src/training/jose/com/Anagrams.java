package training.jose.com;

import java.util.Arrays;

public class Anagrams{


public static void main (String []args ) {

	System.out.println(areAnagrams("anita","attna"));
	
}

public static boolean areAnagrams(String first, String second) {
	
	if (first.length() != second.length())
		return false;
	
	char [] firstArray = first.toCharArray();
	char [] secondtArray = second.toCharArray();
	Arrays.sort(firstArray);
	Arrays.sort(secondtArray);
	
	for (int x=0; x<first.length(); x++)
	{
		if (firstArray[x] != secondtArray[x]) 
			return false;
		
	}
	
	
	return true ;
	}
}