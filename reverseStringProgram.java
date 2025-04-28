package Automatn1_Balaji;

public class reverseStringProgram {

	public static void main(String[] args) {
		String b = "Balaji";
	
		int i = b.length();
		System.out.println("Length of the string "+i);
		for (int j =i-1; j>=0;j--) {
			
			char a = b.charAt(j);
			 System.out.print(a);
			
			
			
		}
	}

}
