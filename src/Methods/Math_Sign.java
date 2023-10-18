package Methods;

public class Math_Sign {
	
	//Access Modifier ReturnType MethodName{SOP};
	
	public void add() {
		System.out.println(10+20);
	}
	public void sub() {
		System.out.println(20-10);
	}
	public void mul() {
		System.out.println(20*3);
	}
	public void div() {
		System.out.println(55/5);
	}

	public static void main(String[] args) {
		//Creating object to call method.
		//className newObjName=new className;
		Math_Sign MS=new Math_Sign();
		
		//Calling method by object.
		//newobjName.methodName.
		MS.add();
		MS.sub();
		MS.mul();
		MS.div();

	}

}
