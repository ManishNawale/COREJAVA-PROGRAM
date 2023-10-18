package Variables;

public class Global_Variable {
	
	static int m=25;//We have to declare global variable by static keyword.
	
	public void GlobalVariable() {
		System.out.println();
	}

	public static void main(String[] args) {
	
		Global_Variable obj=new Global_Variable();
		
		obj.GlobalVariable();
		System.out.println(m);//Here we have to gave only variable name.
		
	}

}
