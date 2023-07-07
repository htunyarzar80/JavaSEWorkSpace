package data_structures;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> scores = new LinkedList<>();
		scores.add(100);
		scores.add(300);
		scores.add(500);
		scores.add(700);
		scores.add(900);
		scores.add(900);
		scores.add(900);
		
		System.out.println(scores);

//		//O(n)
//		System.out.println(scores.get(3));
//		
//		//O(1)
//		System.out.println("Head :"+scores.getFirst());
//		System.out.println("Tail :"+scores.getLast());
//		
//		//O(400
//		System.out.println("Remove :"+scores.remove(3));
//		
//		//O(1)
//		System.out.println("Head Remove :"+scores.removeFirst());
//		System.out.println("Tail Remove :"+scores.removeLast());
//		
//		System.out.println(scores);
	}

}
