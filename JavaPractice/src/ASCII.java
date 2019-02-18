import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter char : ");
		char ch = in.next().charAt(0);
		
		int ascii = ch;
		
		System.out.println("ASCII value for char" + ch + " is : " + ascii);
		
	}

}
