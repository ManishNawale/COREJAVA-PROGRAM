package Automatic_Promotion;

public class Ap {
	
	public void add(int x) {
		System.out.println(x);
	}
	public void V2(float y) {
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Ap obj=new Ap();
		
		obj.add(10);
		obj.add('z');//Automation Promotion is possible.
		
		obj.V2(10);//Automatic Promotion is possible.
		obj.add(1020);
	
	}

}
