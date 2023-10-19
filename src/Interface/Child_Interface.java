package Interface;

public class Child_Interface implements Parent_Interface {
	
	public void M1() {
		System.out.println("I am abstraction from parent interface M1");
	}
	public void M2() {
		System.out.println("I am Abstraction from parent interface M2");
	}

	public static void main(String[] args) {
		
		Child_Interface obj=new Child_Interface();
		
		obj.M1();
		obj.M2();
		
	}

}
