package StringMethod;

public class A {

	public static void main(String[] args) {
		
		String M="Manish Nawale";
		String M2="MANISH NAWALE";
		
		System.out.println(M.length());
		System.out.println(M.charAt(6));
		System.out.println(M.substring(4));
		System.out.println(M.substring(1, 7));
		System.out.println(M.equals(M2));
		System.out.println(M.equalsIgnoreCase(M2));
		System.out.println(M.concat(M2));
		System.out.println(M.concat(" "+M2));
		System.out.println(M.indexOf("s"));
		System.out.println(M.trim());
		System.out.println(M.startsWith("a"));
		System.out.println(M.startsWith("Man"));
		System.out.println(M.endsWith("e"));
		System.out.println(M.endsWith("le"));
		
		
	}

}
