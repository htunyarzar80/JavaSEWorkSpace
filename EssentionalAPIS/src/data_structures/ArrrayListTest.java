package data_structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> newfruitList = new ArrayList<>();
		newfruitList.add("DreagonFruit");
		newfruitList.add("Avogado");
		newfruitList.add("Pineapple");
		

		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Lemon");
		fruitList.add("Mango");
		fruitList.add("Kiwi");
		fruitList.add("Papaya");
		fruitList.add(2, "Coconut");
//		fruitList.addAll(newfruitList);
		fruitList.addAll(0,newfruitList);
		
		fruitList.add("Coconut");
		fruitList.add("Coconut");

	
//		Collections.sort(fruitList);
//		Collections.reverse(fruitList);
		Collections.shuffle(fruitList);
		
		ArrayList<String> outOfStock = new ArrayList<>();
		outOfStock.add("Apple");
		outOfStock.add("Papaya");
		outOfStock.add("Tengrine");
		
		ArrayList<String> onlyInstock = new ArrayList<>();
		onlyInstock.add("Apple");
		onlyInstock.add("Kiwi");
		
		
		System.out.println(fruitList);
//		System.out.println(fruitList.size());
//		System.out.println("Kiwi Index"+fruitList.indexOf("Kiwi"));
//		System.out.println("Coconut Index"+fruitList.lastIndexOf("Coconut"));
//		
//		System.out.println("RetainAll ?"+fruitList.retainAll(onlyInstock));
		
//		System.out.println("remove?"+fruitList.removeAll(outOfStock));
		
//		System.out.println("Kiwi Remove?"+ fruitList.remove("Papaya"));
//		
//		System.out.println(fruitList.set(4,"Kiwi"));
//		
		System.out.println(fruitList);
//		
		
//		System.out.println(fruitList);
//		
//		System.out.println(fruitList.get(3));
//		
//		System.out.println("Kiwi contain? "+fruitList.contains("Kiwi"));
//		
//		System.out.println("Kiwi remove?"+fruitList.remove(3));
//		
//		System.out.println(fruitList);
//		
//		fruitList.clear();
//		System.out.println(fruitList);
//		System.out.println("empty?"+fruitList.isEmpty());
	
		
	}

}
