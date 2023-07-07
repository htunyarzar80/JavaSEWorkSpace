package data_structures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> countryList = new LinkedHashSet<>();
//		Set<String> countryList = new TreeSet<>();
//		Set<String> countryList = new HashSet<>();
		countryList.add("Japan");
		countryList.add("Myanmar");
		countryList.add("Korea");
		countryList.add("Korea");
		countryList.add("Korea");
		countryList.add("Korea");
		countryList.add("Thailand");
		countryList.add("UK");
		countryList.add("USA");
	
		
		System.out.println(countryList);
	
	
//		for(String country : countryList) {
//			if(country.equals("UK")) {
//			System.out.println(country);
//			break;
//			}
//	}

	}

}
