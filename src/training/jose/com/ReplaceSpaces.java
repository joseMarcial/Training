package training.jose.com;

public class ReplaceSpaces {
	
	
	
public static String replaceSpaces(String s) {
	
	StringBuffer buffer = new StringBuffer();
	for(int x =0;x<s.length();x++)
	{
		if (s.charAt(x)!= ' ') {
			buffer.append(s.charAt(x));
		}else {
			buffer.append("%20");
			
		}
	}
	
	return buffer.toString();
	
	
	
	
	
	
	
	
	

}

public static void main (String args[]) {
	
	System.out.println(replaceSpaces("HOLA COMO ESTAS ? "));
	
}
	
	

}
