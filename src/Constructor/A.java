package Constructor;

public class A {
	
	A(){//no-arg constructor.
		System.out.println("I am a constructor");
	}
	A(int x){//Parameterized Constructor.
		System.out.println(x);
	}
	A(int y,int z){
		System.out.println(y+z);
	}
	A(int m, int s, int n){
		System.out.println(m+s+n);
	}

	public static void main(String[] args) {
	
		A obj=new A();
		A obj1=new A();
		A obj2=new A(100);
		A obj3=new A(100,200,300);
		A obj4=new A(20,25);
		A obj5=new A('v');
		A obj6=new A('v','w');
		//A obj7=new A("vijay")..there is no such argument.
		//A obj8=new A(5.5);....AutomationPromotion is not possible.

	}

}
