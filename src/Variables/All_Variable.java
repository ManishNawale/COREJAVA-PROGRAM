package Variables;

public class All_Variable {
	
	int m=25;//Instance Variable.
	static int n=26;//Global Variable.
	
	public void All() {
		System.out.println();
	}

	public static void main(String[] args) {
		
		int s=27;
		System.out.println(s);//Calling local variable.
		
		All_Variable obj=new All_Variable();
		
		obj.All();
		
		System.out.println(obj.m);//Calling Instance variable.
		System.out.println(n);//Calling global variable.

	}

}
