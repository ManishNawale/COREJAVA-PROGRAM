package Exception_Handling;

public class ExceptionHandling_Finally {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(Exception M) {
			System.out.println("This is exception handling.");
		}
		finally {
			System.out.println("This is finally.");
		}

	}

}
