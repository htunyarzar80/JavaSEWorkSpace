package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50);
//	    stream.forEach(n->System.out.println(n));
		stream.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Full :");
		String[] fruits = {"Apple","Mango","Banana","Papaya","Kiwi"};
		Stream<String> fruitsStream = Arrays.stream(fruits);// full stream
		fruitsStream.forEach(System.out :: println);
		System.out.println();
		
		System.out.println("Partial :");
		Stream<String> partialFruits = Arrays.stream(fruits,1,4);
		partialFruits.forEach(System.out :: println);
		System.out.println();
		
		List<String> countryList = new ArrayList<>();
		countryList.add("Myanmar");
		countryList.add("Indo");
		countryList.add("Japan");
		countryList.add("Laos");
		countryList.add("Korea");
		Stream<String> countrySream = countryList.stream();
		countrySream.forEach(System.out :: println);
		
		
		
		
		
	}

}
