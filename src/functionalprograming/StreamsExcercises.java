package functionalprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamsExcercises  {
	
	
	 static class Person implements Comparable<Person> {
		
		String name;
		int edad ;
		String Nationality;
		public String getNationality() {
			return Nationality;
		}

		public void setNationality(String nationality) {
			Nationality = nationality;
		}

		public Person(String name, int edad, String nationality) {
			super();
			this.name = name;
			this.edad= edad;
			this.Nationality= nationality;
		}

		String nameToUpperCase(){
			return this.name.toUpperCase();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public int compareTo(Person arg0) {
			if (this.getEdad() < arg0.getEdad())
				return-1;
			if (this.getEdad() > arg0.getEdad())
				return 1 ;			
			return 0;
		}
		
		@Override
		public String toString() {
			
			return this.name+":"+this.edad+":"+this.Nationality;
		}
		
	
	 }
	 
	 
	
	public static void main (String args[]) {
		
		List<Person> myList = new ArrayList<Person>();
		myList.add(new Person("jose",33, "Mexican"));
		myList.add(new Person("mariana",45, "American"));
		myList.add(new Person("joe",20, "Argetine"));
		myList.add(new Person("mary",25, "colombian") );
		myList.add(new Person("gerardo",17, "colombian"));
		
		
//		Convert elements of a collection to upper case.
		
		List<String > myList2 =
		myList.stream().map(Person::nameToUpperCase).collect(Collectors.toList());
		for (String s : myList2) {
			System.out.println(s);
		}
		
//		Filter collection so that only elements with less than 4 characters are returned
		
		List<Person > myList3 = myList.stream().filter( p -> p.getName().length()< 4 ).collect(Collectors.toList());
		for (Person p : myList3) {
			System.out.println(p.name);
		}
		
//		Flatten multidimensional collection (Example, a list of lists)

		List<List<String>> listOfLocations = new ArrayList<List<String>>();
		List<String> cities = Arrays.asList("mexico", "guadalajara", "queretaro");
		List<String> countries = Arrays.asList("mexico", "usa", "colombia");
		listOfLocations.add(cities);
		listOfLocations.add(countries);
		
		listOfLocations.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);
		
//		Get oldest Person from the collection
		
		 Person result = myList.stream().max((p1 , p2) -> {return p1.compareTo(p2);}).get();
				System.out.println(result.name);
				
//		Get names of all under age of 18
				
		List<String> under18 = myList.stream().filter(p -> p.getEdad() < 18).map(p -> p.name).collect(Collectors.toList());
		for (String p : under18) {
			System.out.println(p);
		}	
		
//		Get people statistics: average age, count, maximum age, minimum age and sum of all ages.
		
		DoubleSummaryStatistics averageAge = myList.stream().collect(Collectors.summarizingDouble(p -> p.getEdad()));
		System.out.println(averageAge);
		
		
//		Partition adults and kids
		
		int adult = 18;
		Map<Boolean, List<Person>> partitionedByAdultsNKids =
				
				myList.stream().collect(Collectors.partitioningBy(p -> p.getEdad() >= adult));
		
		
		System.out.println(partitionedByAdultsNKids);
		
//		Group people by nationality: Person(name, age, nationality)		
		
		Map<String,List<Person>> resultGroupingByNationality = myList.stream().collect(Collectors.groupingBy(Person::getNationality));
		System.out.println(resultGroupingByNationality);

		
//		Return people names separated by comma

		String commaSeparatedNames = myList.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
		System.out.println(commaSeparatedNames);
		
//		Sum all elements of a collection
		
		Double sum  = myList.stream().collect(Collectors.summingDouble(p -> p.getEdad()));
		System.out.println(sum);
		
		
		
 
	}

	

}


	

