package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] reverseChar = new char[str.length()];
		int index = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			reverseChar[index++] = str.charAt(i);
		}
		return reverseChar;
	}
	
	public static void printCharArray(char[] array) {
		for (char c : array) {
			System.out.print(c);
		}
		System.out.println();
	}
	
}
