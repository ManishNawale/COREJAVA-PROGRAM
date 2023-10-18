package Variables;

public class Instance_Variable {
	
	int m=25; //This is instance variable.
	
	public void IV() {
		
		System.out.println(m);
	}

	public static void main(String[] args) {
		
		Instance_Variable Ins=new Instance_Variable();
		
		Ins.IV();
		System.out.println(Ins.m);

	}

}
