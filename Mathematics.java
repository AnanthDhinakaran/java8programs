package functionalInterface;
@FunctionalInterface

public interface Mathematics {
	public int math(int a,int b);
	public default void print() {
		System.out.println("interface");
	}

}
