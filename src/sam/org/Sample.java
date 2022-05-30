package sam.org;

public class Sample {

	public static void main(String[] args) {

		String a = "apple";
		String a1 = "system";
		System.out.println(System.identityHashCode(a));
		a = a.concat(a1);

		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a));
		
		
	}

}
