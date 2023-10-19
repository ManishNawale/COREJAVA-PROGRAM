package AutoBoxing_UnBoxing;

public class TypeClasses {

	public static void main(String[] args) {
		
		int i=10;
		
		Integer I=i;//autoboxing 
		//here value of method taken by java automatically.
		
		Double D=Double.valueOf(10.10);//unboxing.
		
		double d=D;
		//here...xxxValue method is internally used by java compilor.
		
	}

}
