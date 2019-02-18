import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char c = in.next().charAt(0);
		
		if((c>='a' && c <='z') || (c>='A' && c <= 'Z')) {
			System.out.println(c + " : is an alphabet");
			
		}else {
			System.out.println(c + " : is not an alphabet");
		}
		
	}

}
