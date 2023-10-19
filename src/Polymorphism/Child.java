package Polymorphism;

public class Child extends Overriding_Method{
	
	public void marry() {
		System.out.println("Jenifer Lawrence");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		
		obj.property();
		obj.marry();
		
	}

}
