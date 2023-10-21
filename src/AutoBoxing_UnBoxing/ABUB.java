package AutoBoxing_UnBoxing;

public class ABUB {

	public static void main(String[] args) {
		
		// Autoboxing: Converting primitives to objects.
		Integer intobj=42; //Autoboxing int to Integer.
		Double doubleobj=3.14; //Autoboxing double to Double.
		Character charobj='A'; //Autoboxing char to Character.
		
		//Unboxing: Converting objects to primitive.
		int intValue=intobj; //Unboxing Integer to int.
		double doubleValue=doubleobj; //Unboxing Double to double.
		char charValue=charobj; //Unboxing Character to char
		
		System.out.println("Autoboxing and Unboxing Example");
		System.out.println("Integer object: "+intobj);
		System.out.println("Double object: "+doubleobj);
		System.out.println("Character object: "+charobj);
		
		System.out.println("Unboxing to primitives:");
		System.out.println("int: "+intValue);
		System.out.println("double: "+doubleValue);
		System.out.println("char: "+charValue);

	}

}
