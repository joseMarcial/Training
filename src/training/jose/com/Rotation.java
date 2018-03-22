package training.jose.com;

public class Rotation

{

public static boolean isRotation(String rotated, String Original){
 

return isSubString(rotated,Original);
}


public static boolean isSubString(String sub , String original){

String doubleOriginal = original+original;

char[] miArray = doubleOriginal.toCharArray();


int headerPosition = sub.length();
int initialPosition =0;


while (headerPosition <=doubleOriginal.length()) {
	
	///char[] temp = new char[sub.length()];
	StringBuffer buffer = new StringBuffer();
	int tempCounter=0;
	for (int x = initialPosition; x < headerPosition;x++, tempCounter++) {
		//temp[tempCounter]= miArray[x];
		buffer.append(miArray[x]);
	}
	String tempCreatedString = buffer.toString();
	if (tempCreatedString.equals(sub)) {
		return true;
	}else {
		initialPosition++;
		headerPosition++;
	}
	
}

return false;


}


public static void main (String args[]) {
	
	System.out.println(isRotation("waterbottle","erbottlewat"));
}





}