package data_structures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> examMap = new LinkedHashMap<>();
//		Map<String,Integer> examMap = new TreeMap<>();
//		Map<String,Integer> examMap = new HashMap<>();
		examMap.put("V-3", 450);
		examMap.put("V-4", 500);
		examMap.put("V-1", 600);
		examMap.put("V-5", 340);
		examMap.put("V-6", 560);
		examMap.put("V-2", 390);
		examMap.put("V-2", 480);
		
		System.out.println(examMap);
		
//		System.out.println("V-6 Marks :"+examMap.get("V-6"));
//		
//		System.out.println("V-3 contain ? :"+examMap.containsKey("V-2"));
//		System.out.println("600 contain ? :"+examMap.containsValue(600));
//		System.out.println(examMap.replace("V-5", 390));
//
//		examMap.replace("V-4",500,540);
//		examMap.remove("V-5");
//		examMap.remove("V-4",500);
//		System.out.println(examMap);
	}

}
