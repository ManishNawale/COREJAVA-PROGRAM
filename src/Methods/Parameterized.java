package Methods;

public class Parameterized {
	
	public void add(int M,int N) {
		System.out.println(M+N);
	}
	public void add (double m, double n) {
		System.out.println(m*n);
	}
	public void add(String m) {
		System.out.println("Hello World");
	}
	public void add() {
		System.out.println("I am normal method");
	}

	public static void main(String[] args) {
		
		Parameterized obj=new Parameterized();
		
		obj.add(56,75);
		obj.add(23.75,97.50);
		obj.add("m");
		obj.add();

	}

}
