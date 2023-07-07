package lambda;

@FunctionalInterface
public interface CustomComperator<T extends Comparable<T>> {

	T compare(T t1, T t2);
	
}


