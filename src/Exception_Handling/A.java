package Exception_Handling;

public class A {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException m) {
			System.out.println("This Exception Get Handelled");
		}

	}

}
