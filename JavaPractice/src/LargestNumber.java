import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = in.nextInt();
		
		System.out.println("Enter b : ");
		int b = in.nextInt();
		
		System.out.println("Enter c: ");
		int c = in.nextInt();
		
		if(a>b && a>c) { 
			System.out.println("A is largest " + a);
		}else if(b>a && b>c) {
			System.out.println("B is largest " + b);
		}else {
			System.out.println("C is largest " + c);
		}
	}

}
