package training.jose.com;

public class UniqueCharacters{


public static void main (String args []) {

		
		String s = "HOLAEEDDDD";
		
		System.out.println(checkCharUniqueness(s));
		
		
	}
	
	public static int checkCharUniqueness(String s) {
		
		int positionX =-1;
		int positionY = -1;
		int result = 0;
		for(int x=0; x < s.length(); x++) {
			positionX = x ;
			for(int y =0; y <s.length();y++) {
				positionY = y ;
				if (positionX == positionY) {
					
					continue;
				}else {
					if (s.charAt(x) == s.charAt(y)) {
						return 1;
					}
				}
				
			}
			
		}
		return result;
		
	}
	

}
