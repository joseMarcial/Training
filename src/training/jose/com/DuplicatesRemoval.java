package training.jose.com;

public class DuplicatesRemoval
{

	public static String removeDuplicates (String s)
	{
		int positionX = -1;
		int positionY = 1;

		char[] charArray = s.toCharArray();

		for (int x =0 ; x<charArray.length ; x++ )
		{
			positionX = x;
			for (int y= 0; y <charArray.length ; y++)
			{
				positionY= y;
		
				if (positionX == positionY)
				{
					continue;
				}else
				{
					if (charArray[x] == charArray[y]) 
					{
						int reaminCounter = y;
						while (reaminCounter < s.length()-2) 
						{
							charArray[reaminCounter] = charArray[reaminCounter+1];
							reaminCounter++;
						}
						charArray[reaminCounter+1] =' ';
			
					}
		
				}
			}
	
		}

		return new String (charArray).trim();

	}

public static void main (String []args ) {
	
	System.out.println(removeDuplicates("H0LAJ0SEcomoestas"));
	
}


}