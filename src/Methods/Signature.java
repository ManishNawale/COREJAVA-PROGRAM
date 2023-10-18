package Methods;

public class Signature {
	
	public void method(float m) {
		
		System.out.println(m);
	}

	public static void main(String[] args) {
		
		Signature obj=new Signature();
		
		obj.method('N');//Declare in single apostrophe.

	}

}
