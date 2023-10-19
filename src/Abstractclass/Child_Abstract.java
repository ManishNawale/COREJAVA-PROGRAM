package Abstractclass;

public class Child_Abstract extends Parent_Abstract {
	
	public void M1() {
		System.out.println("I am abstract M1 method in child class");
	}
	public void M2() {
		System.out.println("I am abstract M2 method in child class");
	}

	public static void main(String[] args) {
		
		Child_Abstract obj=new Child_Abstract();
		
		obj.M1();
		obj.M2();
		obj.M3();

	}

}
