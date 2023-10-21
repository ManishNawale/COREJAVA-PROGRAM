package Heirarchical_Inheritance;

public class Child2 extends Child1 {
	
	public void trian() {
		System.out.println("I am train from child2");
	}

	public static void main(String[] args) {
		
		Child2 obj=new Child2();
		
		obj.Car();
		obj.Car2();
		obj.Cycle();
		obj.trian();

	}

}
