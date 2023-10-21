package Heirarchical_Inheritance;

public class Child1 extends parent {
	
	public void Cycle() {
		System.out.println("i am Leader cycle from child1.");
	}

	public static void main(String[] args) {
		
		Child1 call=new Child1();
		
		call.Car();
		call.Car2();
		call.Cycle();
		
	}

}
