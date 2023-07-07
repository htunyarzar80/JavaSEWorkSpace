package data_structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IteratorTest {
	
	static void forEach (Collection<?> collection) {
		
		Iterator<?> it = collection.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> favProgrammingList = new LinkedHashSet<>();
		favProgrammingList.add("Java");
		favProgrammingList.add("PHP");
		favProgrammingList.add("C++");
		favProgrammingList.add("Pytho,n");
		favProgrammingList.add("Groovy");
		
		List<Integer> ageList = new ArrayList<>();
		ageList.add(34);
		ageList.add(30);
		ageList.add(50);
		ageList.add(49);
		ageList.add(60);
		
		forEach(favProgrammingList);
		forEach(ageList);
		
//		Iterator<String> it = favProgrammingList.iterator();
//		
//		while (it.hasNext()) {
//			String favLang = it.next();
//			System.out.println(favLang);
//		}
//		
//		String favLang = it.next();
//		favLang = it.next();
//		System.out.println(favLang);
		
	}

}
