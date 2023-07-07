package generic;

public class NumberBox<T extends Number> {
	private T t;

	public void add(T t) {
		this.t = t;

	}

	public T get() {
		return t;
	}

	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}

}
