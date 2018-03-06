package training.jose.com;

import java.util.Stack;

public class StringReverse{
	
public static void main (String[] args){
	
	System.out.println(reverse("abcd"));
	
}
	
public static String reverse(String s){
	Stack<Character> myStack = new Stack<>();
	StringBuffer result = new StringBuffer();
	for(int x=0; x< s.length(); x++){
		myStack.push(s.charAt(x));
		
	}
	while (!myStack.empty())
	{
		result.append(myStack.pop());
	}
	return result.toString();
}
	
	
	
	
	
	
	
}