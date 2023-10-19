package Abstractclass;

public abstract class Parent_Abstract {

	public abstract void M1();//abstract method.
	
	public abstract void M2();//abstract method.
	
	public void M3() {//We can also create concrete method in abstract method.
		System.out.println("I am concrete/normal method");
	}
	
}
