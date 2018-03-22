package functionalprograming;

import java.util.Arrays;
import java.util.List;

public class Streams2Excercises {
	
	public static void main (String args[]) {
	 List words = Arrays.asList("hi", "hello", "morning");
	 
	 //Produce a single String that is the result of concatenating the uppercase versions of all of the Strings
	 
	 System.out.println(words.stream().reduce((a,b) -> a.toString().toUpperCase() + b.toString().toUpperCase()).get());
	 
//	 Produce the same String as above, but this time via a map operation that turns the words into upper case, followed by a reduce operation that concatenates them
	 System.out.println(words.stream().map(s -> s.toString().toUpperCase()).reduce((a,b) -> a.toString() + b.toString()).get());
	 
//	Produce a String that is all the words concatenated together, but with commas in between
	 System.out.println(words.stream().reduce((a,b) -> a.toString() + ","+ b.toString()).get());
	 
//	 Find the total number of characters (i.e., sum of the lengths) of the strings in the List.
	 
	 System.out.println(words.stream().mapToLong(s -> s.toString().length()).sum());
	 
//	 Find the number of words that contain an “h”
	 System.out.println(words.stream().filter( a -> a.toString().contains("h")).count());
	}

}
