package Variables;

public class Local_Variable {
	
	public void LV() {
		
		int m=30; //Local Variable.
		System.out.println(m);
	}

	public static void main(String[] args) {
		
		int n=20; //Local Variable.
		System.out.println(n);
		
		//Creating an object ==> className objName=new className();
		Local_Variable Varable=new Local_Variable();
		
		//Calling for method ==> objName.methodName();
		Varable.LV();
		
	}

}